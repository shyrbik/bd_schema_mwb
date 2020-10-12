package by.epamtc.rumiantsau.service;

import by.epamtc.rumiantsau.bean.Car;
import by.epamtc.rumiantsau.bean.CarData;

import java.util.List;

public interface CarService {

    List<Car> getCars(CarData carData);
}
