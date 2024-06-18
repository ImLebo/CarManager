package com.carcreate.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcreate.app.domain.Car;
import com.carcreate.app.services.CarServices;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarServices carServices;

	@PostMapping("/create")
	public String addCar(@RequestBody Car car) {
		carServices.create(car);

		return "create-car";
	}

	@PutMapping("/{id}")
	public void updateCar(@PathVariable Long id, @RequestBody Car car) {
		car.setId(id);
		carServices.update(car);
	}

	@DeleteMapping("/{id}")
	public void deleteCar(@PathVariable Long id){
		carServices.delete(id);
	}
	
	@GetMapping
	public String listCar(Model model) {
		List<Car> carList = carServices.read();
		model.addAttribute("carsAttribute", carList);
		return "cars-list";
	}
	
}
