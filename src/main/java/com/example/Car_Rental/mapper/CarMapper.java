
package com.example.Car_Rental.mapper;

import com.example.Car_Rental.dto.CarDto;
import com.example.Car_Rental.entity.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class CarMapper {
    private ReservationMapper reservationMapper;

    public Car mapToEntity(CarDto carDto) {
        Car car = new Car();
        car.setId(carDto.getId());
        car.setModel(carDto.getModel());
        car.setType(carDto.getType());
        car.setYear(carDto.getYear());
        car.setFuel(carDto.getFuel());
        return car;
    }

    public CarDto mapToDto(Car car) {
        CarDto carDto = new CarDto();
        carDto.setId(car.getId());
        carDto.setModel(car.getModel());
        carDto.setType(car.getType());
        carDto.setYear(car.getYear());
        carDto.setFuel(car.getFuel());
        carDto.setReservationDtoList(car.getReservations().stream().map(reservation -> reservationMapper.mapToDto(reservation)).collect(Collectors.toList()));

        if (car.getClient() != null) {
            carDto.setClientId(car.getClient().getId());
            carDto.setClientName(car.getClient().getFirstname());
            carDto.setClientSurname(car.getClient().getSurname());
        } else {

            carDto.setClientId(null);
            carDto.setClientName(null);
            carDto.setClientSurname(null);
        }
        return carDto;
    }
}
