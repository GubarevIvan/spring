package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.CarsListDao;
import web.model.Car;
import java.util.List;

@Controller
public class CarsController {
    CarsListDao carsListDao = new CarsListDao();
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        List<Car> cars = carsListDao.getCars();
        int max = Integer.parseInt(count) >= 5 ? 5 : Integer.parseInt(count);
        cars = cars.subList(0, max);
        model.addAttribute("cars", cars);
        return "cars";
    }
}