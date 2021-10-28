package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car("Lada", 456, "blue"));
        allCars.add(new Car("Porsche", 888, "red"));
        allCars.add(new Car("Tesla", 555, "black"));
        allCars.add(new Car("Nissan", 246, "green"));
        allCars.add(new Car("Reno", 729, "yellow"));
        return allCars;
    }
}

