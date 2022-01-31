package web.controller;
import Model.Car;
import Service.CarService;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class СarsController {

    @GetMapping(value = "/cars")
    public String carsTable(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        Car firstCar = new Car(1.7, "Nissan", "red");
        Car secondCar = new Car(1.4, "Mazda", "white");
        Car thirdCar = new Car(1.6, "BMW", "blue");
        Car fourthCar = new Car(2.4, "Lexus", "black");
        Car fifthCar = new Car(2.0, "Toyota", "green");

        List<Car> carList = new ArrayList<Car>();
        carList.add(firstCar);
        carList.add(secondCar);
        carList.add(thirdCar);
        carList.add(fourthCar);
        carList.add(fifthCar);

        CarService carService = new CarServiceImpl();

        List<Car> subList = carService.subCarList(carList, count);
        model.addAttribute(subList);
        return "cars";

        }
    }




