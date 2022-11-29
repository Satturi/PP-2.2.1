package hiber.service;

import hiber.model.Car;


import java.util.List;

public interface CarServise {
    void add(Car Car);
    List<Car> listCars();
}
