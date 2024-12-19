`CarService.javapackage com.example.carmanagement.service;

import com.example.carmanagement.entity.Car;
import com.example.carmanagement.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car updatedCar) {
        Car existingCar = getCarById(id);
        existingCar.setName(updatedCar.getName());
        existingCar.setModel(updatedCar.getModel());
        existingCar.setYear(updatedCar.getYear());
        existingCar.setPrice(updatedCar.getPrice());
        existingCar.setColor(updatedCar.getColor());
        existingCar.setFuelType(updatedCar.getFuelType());
        return carRepository.save(existingCar);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
