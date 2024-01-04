package com.example.Car_Rental.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReservationDto {

    private long id;
    private LocalDate date_from;
    private LocalDate date_to;
    private double price;
}
