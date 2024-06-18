package com.carcreate.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcreate.app.domain.Car;
import com.carcreate.app.repository.CarRepository;

@Service
public class CarServices {
	
	@Autowired
	private CarRepository carRepository;

	public void create(Car car){
		carRepository.save(car);
	}

	public List<Car> read(){
		return carRepository.findAll();
	}

	public void update(Car car){
		if (carRepository.existsById(car.getId())) {
			carRepository.save(car);
		} else{
			System.out.println("No se ha podido actualizar el carro con id: "+car.getId());
		}
	}

	public void delete(Long id){
		if (carRepository.existsById(id)) {
			carRepository.deleteById(id);
		} else{
			System.out.println("No se ha podido eliminar el carro con id: "+id);
		}
	}

}
