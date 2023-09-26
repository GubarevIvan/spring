package web.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private List<Car> carsList =  new CarsListDao().getCars();
    public List<Car> getCarsService(int numberOfCars) {
        List<Car> resultCar =  carsList.subList(0, numberOfCars);
        return resultCar;
    }
}