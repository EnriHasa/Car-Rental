package com.example.Car_Rental.repository;

import com.example.Car_Rental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> {
}
