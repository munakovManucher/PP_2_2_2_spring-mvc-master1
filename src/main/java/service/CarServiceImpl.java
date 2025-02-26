package service;

import model.Car;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", "Black", 2020));
        cars.add(new Car("Kia Avella", "White", 1999));
        cars.add(new Car("Honda Civic", "Red", 2021));    // новый автомобиль
        cars.add(new Car("Ford Mustang", "Blue", 2019));  // новый автомобиль
        cars.add(new Car("BMW X5", "Silver", 2022));      // новый автомобиль
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }   

    @Override
    public List<Car> getCars(int count) {
        if(count >= cars.size()){
            return cars;
        } else {
            return new ArrayList<>(cars.subList(0, count));
        }
    }
}