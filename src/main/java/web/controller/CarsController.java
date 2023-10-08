package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarsController {

    CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = carService.getCarsList();
        if (count != null) {
            int max = Math.min(count, 5);
            cars = cars.subList(0, max);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}