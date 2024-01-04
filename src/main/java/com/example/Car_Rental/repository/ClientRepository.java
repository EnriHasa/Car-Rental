package com.example.Car_Rental.repository;

import com.example.Car_Rental.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
