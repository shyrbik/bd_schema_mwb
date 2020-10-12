package by.epamtc.rumiantsau.service.impl;

import by.epamtc.rumiantsau.bean.Order;
import by.epamtc.rumiantsau.bean.User;
import by.epamtc.rumiantsau.bean.InfoForRegistration;
import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.dao.DAOProvider;
import by.epamtc.rumiantsau.dao.UserDAO;
import by.epamtc.rumiantsau.dao.exception.DAOException;
import by.epamtc.rumiantsau.dao.exception.UserAlreadyExistsDAOException;
import by.epamtc.rumiantsau.dao.exception.UserNotFoundDAOException;
import by.epamtc.rumiantsau.service.UserService;
import by.epamtc.rumiantsau.service.exception.ServiceException;
import by.epamtc.rumiantsau.service.exception.UserAlreadyExistsServiceException;
import by.epamtc.rumiantsau.service.exception.UserNotFoundServiceException;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User authorization(InfoForAuthorization authData) throws ServiceException {
        User user;
        //todo: логическая валидация (выбрасываем исключение)

        DAOProvider daoProvider = DAOProvider.getInstance();
        UserDAO userDAO = daoProvider.getUserDAO();

        try {
            user = userDAO.authorization(authData);
        } catch (UserNotFoundDAOException e) {
            throw new UserNotFoundServiceException(e);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return user;
    }

    @Override
    public boolean registration(InfoForRegistration infoForRegistration) throws ServiceException {
        boolean registration;
        //todo: логическая валидация (выбрасываем исключение)

        DAOProvider daoProvider = DAOProvider.getInstance();
        UserDAO userDAO = daoProvider.getUserDAO();

        try {
            registration = userDAO.registration(infoForRegistration);
        } catch (UserAlreadyExistsDAOException e) {
            throw new UserAlreadyExistsServiceException(e);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return registration;
    }

    @Override
    public List<Order> getUserOrders(int userID) throws ServiceException {
        List<Order> userOrders;

        DAOProvider daoProvider = DAOProvider.getInstance();
        UserDAO userDAO = daoProvider.getUserDAO();

        try {
            userOrders = userDAO.getUserOrders(userID);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return userOrders;
    }
}
