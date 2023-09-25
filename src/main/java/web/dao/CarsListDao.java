package web.dao;

import web.model.Car;
import java.util.*;

public class CarsListDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("black", "KIA", 19));
        cars.add( new Car("red", "Lada", 15));
        cars.add( new Car("black", "KIA", 19));
        cars.add( new Car("white", "Hummer", 45));
        cars.add( new Car("orange", "Mini", 12));
    }
    public List<Car> getCars() {
        return cars;
    }
}