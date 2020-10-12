package by.epamtc.rumiantsau.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Order implements Serializable {

    private static final long serialVersionUID = 1648826363500527628L;

    private int customerID;
    private int orderId;
    private Date orderDate;
    private String orderStatus;
    private Date rentalStart;
    private Date rentalEnd;
    private int carID;
    private String carBrand;
    private String carModel;
    private String carPricePerDay;
    private int managerID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(Date rentalStart) {
        this.rentalStart = rentalStart;
    }

    public Date getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(Date rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarPricePerDay() {
        return carPricePerDay;
    }

    public void setCarPricePerDay(String carPricePerDay) {
        this.carPricePerDay = carPricePerDay;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return customerID == order.customerID &&
                orderId == order.orderId &&
                carID == order.carID &&
                managerID == order.managerID &&
                Objects.equals(orderDate, order.orderDate) &&
                Objects.equals(orderStatus, order.orderStatus) &&
                Objects.equals(rentalStart, order.rentalStart) &&
                Objects.equals(rentalEnd, order.rentalEnd) &&
                Objects.equals(carBrand, order.carBrand) &&
                Objects.equals(carModel, order.carModel) &&
                Objects.equals(carPricePerDay, order.carPricePerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, orderId, orderDate, orderStatus, rentalStart,
                rentalEnd, carID, carBrand, carModel, carPricePerDay, managerID);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "customerID=" + customerID +
                ", orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", rentalStart=" + rentalStart +
                ", rentalEnd=" + rentalEnd +
                ", carID=" + carID +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carPricePerDay='" + carPricePerDay + '\'' +
                ", managerID=" + managerID +
                '}';
    }
}
