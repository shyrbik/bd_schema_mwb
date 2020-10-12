package by.epamtc.rumiantsau.service;

import by.epamtc.rumiantsau.bean.Order;
import by.epamtc.rumiantsau.bean.User;
import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.bean.InfoForRegistration;
import by.epamtc.rumiantsau.service.exception.ServiceException;

import java.util.List;

public interface UserService {

    User authorization(InfoForAuthorization authData) throws ServiceException;
    boolean registration(InfoForRegistration infoForRegistration) throws ServiceException;
    List<Order> getUserOrders(int userID) throws ServiceException;
}
