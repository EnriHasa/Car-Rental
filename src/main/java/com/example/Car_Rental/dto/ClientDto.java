package com.example.Car_Rental.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {
    private long id;
    private String firstname;
    private String surname;
    private String email;
    private String phone_number;
    private int age;
    private String password;
}
