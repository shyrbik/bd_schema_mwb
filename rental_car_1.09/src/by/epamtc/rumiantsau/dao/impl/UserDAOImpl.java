package by.epamtc.rumiantsau.dao.impl;
import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.bean.Order;
import by.epamtc.rumiantsau.bean.InfoForRegistration;
import by.epamtc.rumiantsau.bean.User;
import by.epamtc.rumiantsau.dao.UserDAO;
import by.epamtc.rumiantsau.dao.connection.ConnectionPool;
import by.epamtc.rumiantsau.dao.exception.ConnectionPoolError;
import by.epamtc.rumiantsau.dao.exception.DAOException;
import by.epamtc.rumiantsau.dao.exception.UserAlreadyExistsDAOException;
import by.epamtc.rumiantsau.dao.exception.UserNotFoundDAOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserDAOImpl implements UserDAO {

    //Не работает, поправить до 09102020










    /*

    private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);

    private static final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String SELECT_USER_BY_LOGIN_SQL =
            "SELECT u.user_id, u.user_login, rol.user_role, rat.user_rating " +
                    "FROM users u JOIN user_roles rol ON u.user_role=rol.user_role_id " +
                    "JOIN user_ratings rat ON u.user_rating=rat.user_rating_id WHERE u.user_login=? and u.user_password=?;";

    private static final String INSERT_NEW_USER_SQL =
            "INSERT INTO users (user_email, user_phone, user_login, user_password, user_rating, user_role) " +
                    "VALUES (?, ?, ?, ?, 1, 1)";

    private static final String SELECT_ALL_USER_ORDERS =
            "SELECT o.customer_id, o.user_order_id, o.user_order_date, s.order_status, o.rental_start," +
                    "o.rental_end, o.car_id, c.car_brand, c.car_model, c.car_price_per_day, o.manager_id " +
                    "FROM user_orders o JOIN cars c ON o.car_id=c.car_id JOIN order_statuses s " +
                    "ON o.order_status=s.order_status_id WHERE o.customer_id=? ORDER BY user_order_date DESC";

    private static final String COLUMN_USER_ID = "user_id";
    private static final String COLUMN_CUSTOMER_ID = "customer_id";
    private static final String COLUMN_USER_LOGIN = "user_login";
    private static final String COLUMN_USER_ROLE = "user_role";
    private static final String COLUMN_USER_RATING = "user_rating";
    private static final String COLUMN_USER_ORDER_ID = "user_order_id";
    private static final String COLUMN_USER_ORDER_DATE = "user_order_date";
    private static final String COLUMN_ORDER_STATUS = "order_status";
    private static final String COLUMN_RENTAL_START = "rental_start";
    private static final String COLUMN_RENTAL_END = "rental_end";
    private static final String COLUMN_CAR_ID = "car_id";
    private static final String COLUMN_CAR_BRAND = "car_brand";
    private static final String COLUMN_CAR_MODEL = "car_model";
    private static final String COLUMN_CAR_PRICE_PER_DAY = "car_price_per_day";
    private static final String COLUMN_MANAGER_ID = "manager_id";



    @Override
    public User authorization(InfoForAuthorization authData) throws DAOException {
        User user;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = connectionPool.takeConnection();
            preparedStatement = connection.prepareStatement(SELECT_USER_BY_LOGIN_SQL);

            preparedStatement.setString(1, authData.getLogin());
            preparedStatement.setString(2, authData.getPassword());

            resultSet = preparedStatement.executeQuery();

            if (!resultSet.next()) {
                throw new UserNotFoundDAOException();
            }

            int id = resultSet.getInt(COLUMN_USER_ID);
            String login = resultSet.getString(COLUMN_USER_LOGIN);
            String role = resultSet.getString(COLUMN_USER_ROLE);
            String rating = resultSet.getString(COLUMN_USER_RATING);

            user = new User();
            user.setId(id);
            user.setLogin(login);
            user.setRole(role);
        } catch (ConnectionPoolError | SQLException e) {
            logger.error("Severe database error!", e);
            throw new DAOException(e);
        } finally {
            if (connection != null) {
                connectionPool.closeConnection(connection, preparedStatement, resultSet);
            }
        }

        return user;
    }
    @Override
    public boolean registration(InfoForRegistration infoForRegistration) throws DAOException {
        boolean registration = false;

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = connectionPool.takeConnection();
            preparedStatement = connection.prepareStatement(INSERT_NEW_USER_SQL);

            preparedStatement.setString(1, (infoForRegistration.getEmail().length() > 1)
                    ? infoForRegistration.getEmail() : null);
            preparedStatement.setString(2, infoForRegistration.getPhone());
            preparedStatement.setString(3, infoForRegistration.getLogin());
            preparedStatement.setString(4, infoForRegistration.getPassword());

            if (preparedStatement.executeUpdate() == 1) {
                registration = true;
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            throw new UserAlreadyExistsDAOException(e);
        } catch (ConnectionPoolError | SQLException e) {
            logger.error("Severe database error!", e);
        } finally {
            if (connectionPool != null) {
                connectionPool.closeConnection(connection, preparedStatement);
            }
        }

        return registration;
    }

    @Override
    public List<Order> getUserOrders(int userID) throws DAOException {
        List<Order> userOrders = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = connectionPool.takeConnection();
            preparedStatement = connection.prepareStatement(SELECT_ALL_USER_ORDERS);
            preparedStatement.setInt(1, userID);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Order order = new Order();

                order.setCustomerID(resultSet.getInt(COLUMN_CUSTOMER_ID));
                order.setOrderId(resultSet.getInt(COLUMN_USER_ORDER_ID));
                order.setOrderDate(resultSet.getDate(COLUMN_USER_ORDER_DATE));
                order.setOrderStatus(resultSet.getString(COLUMN_ORDER_STATUS));
                order.setRentalStart(resultSet.getDate(COLUMN_RENTAL_START));
                order.setRentalEnd(resultSet.getDate(COLUMN_RENTAL_END));
                order.setCarID(resultSet.getInt(COLUMN_CAR_ID));
                order.setCarBrand(resultSet.getString(COLUMN_CAR_BRAND));
                order.setCarModel(resultSet.getString(COLUMN_CAR_MODEL));
                order.setCarPricePerDay(resultSet.getString(COLUMN_CAR_PRICE_PER_DAY));
                order.setManagerID(resultSet.getInt(COLUMN_MANAGER_ID));

                userOrders.add(order);
            }
        } catch (SQLException e) {
            logger.error("Severe database error!", e);
            throw new DAOException(e);
        } finally {
            if (connection != null) {
                connectionPool.closeConnection(connection, preparedStatement, resultSet);
            }
        }

        return userOrders;
    }

     */
}
