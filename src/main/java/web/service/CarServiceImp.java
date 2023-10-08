package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private CarsDao carsList;

    public CarServiceImp(CarsDao carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsList() {
        return carsList.getCars();
    }
}