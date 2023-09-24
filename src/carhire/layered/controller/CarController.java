/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.controller;


import carhire.layered.dto.CarDto;
import carhire.layered.service.ServiceFactory;
import static carhire.layered.service.ServiceFactory.ServiceType.CAR;
import carhire.layered.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarController {

    CarService carService = (CarService) ServiceFactory.getInstance().getService(CAR);
    
    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }
    public ArrayList<CarDto> getAllCar() throws Exception {
        return carService.getAllCar();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String deleteCar(String id) throws Exception {
        return carService.deleteCar(id);
    }

    public CarDto getCar(String Car_id) throws Exception {
        return carService.getCar(Car_id);
    }
    
}
