package com.cars.cars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.cars.dto.CarDTO;

@RestController

@RequestMapping("/")

public class CarsController {
    
   @PostMapping
   public void createCar(@RequestBody CarDTO req){
    System.out.println(req);
   }

}
