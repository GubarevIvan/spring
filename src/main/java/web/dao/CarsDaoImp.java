package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.*;

@Repository
public class CarsDaoImp implements CarsDao {
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