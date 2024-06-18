package com.carcreate.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carcreate.app.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long>{}