package by.epamtc.rumiantsau.dao;

import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.bean.Order;
import by.epamtc.rumiantsau.bean.InfoForRegistration;
import by.epamtc.rumiantsau.bean.User;
import by.epamtc.rumiantsau.dao.exception.DAOException;

import java.util.List;

public interface UserDAO {

    User authorization(InfoForAuthorization authData) throws DAOException;
    boolean registration(InfoForRegistration infoForRegistration) throws DAOException;
    List<Order> getUserOrders(int userID) throws DAOException;
}
