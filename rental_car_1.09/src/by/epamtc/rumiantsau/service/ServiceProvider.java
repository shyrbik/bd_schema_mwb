package by.epamtc.rumiantsau.service;

import by.epamtc.rumiantsau.service.impl.CarServiceImpl;
import by.epamtc.rumiantsau.service.impl.UserServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private final UserService userService = new UserServiceImpl();
    private final CarService carService = new CarServiceImpl();

    private ServiceProvider() {}

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public CarService getCarService() {
        return carService;
    }
}
