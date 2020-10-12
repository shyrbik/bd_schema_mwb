package by.epamtc.rumiantsau.bean;

import java.util.Objects;

public class ReturnCarAct {
    private boolean penalty_fuel;
    private boolean penalty_washing;
    private double penalty_damage;
    private double penalty_kilometers;
    private double penalty_extra_day;

    public ReturnCarAct() {
    }

    public boolean isPenalty_fuel() {
        return penalty_fuel;
    }

    public void setPenalty_fuel(boolean penalty_fuel) {
        this.penalty_fuel = penalty_fuel;
    }

    public boolean isPenalty_washing() {
        return penalty_washing;
    }

    public void setPenalty_washing(boolean penalty_washing) {
        this.penalty_washing = penalty_washing;
    }

    public double getPenalty_damage() {
        return penalty_damage;
    }

    public void setPenalty_damage(double penalty_damage) {
        this.penalty_damage = penalty_damage;
    }

    public double getPenalty_kilometers() {
        return penalty_kilometers;
    }

    public void setPenalty_kilometers(double penalty_kilometers) {
        this.penalty_kilometers = penalty_kilometers;
    }

    public double getPenalty_extra_day() {
        return penalty_extra_day;
    }

    public void setPenalty_extra_day(double penalty_extra_day) {
        this.penalty_extra_day = penalty_extra_day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnCarAct returnCarAct = (ReturnCarAct) o;
        return penalty_fuel == returnCarAct.penalty_fuel &&
                penalty_washing == returnCarAct.penalty_washing &&
                Double.compare(returnCarAct.penalty_damage, penalty_damage) == 0 &&
                Double.compare(returnCarAct.penalty_kilometers, penalty_kilometers) == 0 &&
                Double.compare(returnCarAct.penalty_extra_day, penalty_extra_day) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(penalty_fuel, penalty_washing, penalty_damage, penalty_kilometers, penalty_extra_day);
    }

    @Override
    public String toString() {
        return "ReturnCar{" +
                "penalty_fuel=" + penalty_fuel +
                ", penalty_washing=" + penalty_washing +
                ", penalty_damage=" + penalty_damage +
                ", penalty_kilometers=" + penalty_kilometers +
                ", penalty_extra_day=" + penalty_extra_day +
                '}';
    }
}
