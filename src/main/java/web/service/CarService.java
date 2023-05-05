package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = new ArrayList<>(5);
    {
        cars.add(new Car(1, "Porshe", 0));
        cars.add(new Car(2, "Porshe", 10000));
        cars.add(new Car(3, "Lada", 0));
        cars.add(new Car(4, "Lada", 10000));
        cars.add(new Car(5, "Kek", 0));
    }

    public List<Car> getCarList(int count) {
        return count >= 0 && count < cars.size() ? cars.subList(0, count) : cars;
    }

}
