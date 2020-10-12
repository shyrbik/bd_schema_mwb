package by.epamtc.rumiantsau.bean;

import java.util.Objects;

public class CarInfo {
    private String car_brand;
    private String car_model;
    private String car_color;
    private String car_year;
    private int car_fuel;
    private String car_transmission;
    private String car_body;
    private byte car_number_of_places;
    private double car_kilometers;


    public CarInfo() {
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getCar_color() {
        return car_color;
    }

    public String getCar_year() {
        return car_year;
    }

    public int getCar_fuel() {
        return car_fuel;
    }

    public String getCar_transmission() {
        return car_transmission;
    }

    public String getCar_body() {
        return car_body;
    }

    public byte getCar_number_of_places() {
        return car_number_of_places;
    }

    public double getCar_kilometers() {
        return car_kilometers;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public void setCar_year(String car_year) {
        this.car_year = car_year;
    }

    public void setCar_fuel(int car_fuel) {
        this.car_fuel = car_fuel;
    }

    public void setCar_transmission(String car_transmission) {
        this.car_transmission = car_transmission;
    }

    public void setCar_body(String car_body) {
        this.car_body = car_body;
    }

    public void setCar_number_of_places(byte car_number_of_places) {
        this.car_number_of_places = car_number_of_places;
    }

    public void setCar_kilometers(double car_kilometers) {
        this.car_kilometers = car_kilometers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return car_fuel == carInfo.car_fuel &&
                car_number_of_places == carInfo.car_number_of_places &&
                Double.compare(carInfo.car_kilometers, car_kilometers) == 0 &&
                Objects.equals(car_brand, carInfo.car_brand) &&
                Objects.equals(car_model, carInfo.car_model) &&
                Objects.equals(car_color, carInfo.car_color) &&
                Objects.equals(car_year, carInfo.car_year) &&
                Objects.equals(car_transmission, carInfo.car_transmission) &&
                Objects.equals(car_body, carInfo.car_body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car_brand, car_model, car_color, car_year, car_fuel, car_transmission, car_body, car_number_of_places, car_kilometers);
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "car_brand='" + car_brand + '\'' +
                ", car_model='" + car_model + '\'' +
                ", car_color='" + car_color + '\'' +
                ", car_year='" + car_year + '\'' +
                ", car_fuel=" + car_fuel +
                ", car_transmission='" + car_transmission + '\'' +
                ", car_body='" + car_body + '\'' +
                ", car_number_of_places=" + car_number_of_places +
                ", car_kilometers=" + car_kilometers +
                '}';
    }
}
