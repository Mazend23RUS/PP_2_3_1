package DAO;

import Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class serviceCars {

    private List<Car> cars;

    {

        cars = new ArrayList<>();
        cars.add(new Car("BMW", "525", 2002));
        cars.add(new Car("AUDI", "A6", 2017));
        cars.add(new Car("Mersedes", "E class", 2022));
        cars.add(new Car("Reno", "lurgus", 2008));
        cars.add(new Car("Porsch", "911", 2013));
    }

    public List<Car> getListCar(String count) {
        if (count == null || Integer.parseInt(count) >= 5) {
            return cars;
        } else {
            return cars.stream().
                    limit(Integer.parseInt(count)).
                    collect(Collectors.toList());
        }
    }
}
