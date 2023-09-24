/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.layered.service.custom;

import carhire.layered.dto.CarDto;
import carhire.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CarService extends SuperService{
    String addCar(CarDto carDto) throws Exception;
    String updateCar(CarDto carDto) throws Exception;
    String deleteCar(String id) throws Exception;
    CarDto getCar(String id) throws Exception;
    ArrayList<CarDto> getAllCar() throws Exception;
}
