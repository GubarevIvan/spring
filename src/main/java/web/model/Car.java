package web.model;

public class Car {
    private long id;

    private String color;

    private String carBrand;

    private int clearance;

    public Car() {}

    public Car(String color, String carBrand, int clearance) {
        this.color = color;
        this.carBrand = carBrand;
        this.clearance = clearance;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Car{" +
                " color = '" + color + '\'' +
                ", carBrand = '" + carBrand + '\'' +
                ", clearance = " + clearance +
                '}';
    }
}