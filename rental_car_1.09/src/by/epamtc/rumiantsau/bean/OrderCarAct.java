package by.epamtc.rumiantsau.bean;

import java.util.Objects;

public class OrderCarAct {
    private double rentCost;
    private double deposit;

    public OrderCarAct() {
    }

    public double getRentCost() {
        return rentCost;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCarAct orderCarAct = (OrderCarAct) o;
        return Double.compare(orderCarAct.rentCost, rentCost) == 0 &&
                Double.compare(orderCarAct.deposit, deposit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentCost, deposit);
    }

    @Override
    public String toString() {
        return "RentPrice{" +
                "rentCost=" + rentCost +
                ", deposit=" + deposit +
                '}';
    }
}
