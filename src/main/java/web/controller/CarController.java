package web.controller;

import DAO.serviceCars;
import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class CarController {

    @GetMapping(value ="/Cars")
    public String printCarsSite (@RequestParam (value = "count", required = false) String count, ModelMap model){
        serviceCars serviceCars = new serviceCars();
        List <Car> cars = serviceCars.getListCar(count);
        model.addAttribute("Cars",cars);
        return "Cars";
    }
}
