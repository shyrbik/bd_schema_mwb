package by.epamtc.rumiantsau.dao;

import by.epamtc.rumiantsau.bean.CarInfo;

import java.util.List;

public interface CarDAO {

    List<CarInfo> getCars(CarInfo carData);
}
