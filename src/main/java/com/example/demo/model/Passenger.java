package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger implements Serializable {

    private String firstname;
    private String lastname;
    private String gender;
    private Integer age;
    private String phone;
    private String email;

}
