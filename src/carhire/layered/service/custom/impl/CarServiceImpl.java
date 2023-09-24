/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.service.custom.impl;

import carhire.layered.dao.DaoFactory;
import carhire.layered.dao.custom.CarDao;
import carhire.layered.dto.CarDto;
import carhire.layered.entity.CarEntity;
import carhire.layered.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarServiceImpl implements CarService{
    
    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    @Override
    public String addCar(CarDto dto) throws Exception {
        CarEntity carEntity = new CarEntity(dto.getId(), dto.getModel(), dto.getBrand(), dto.getType(), dto.getPay(),dto.getYear(), dto.getVehicleNum(), dto.getAvailable());
        
        if(carDao.add(carEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }

    @Override
    public String updateCar(CarDto dto) throws Exception {
        CarEntity carEntity = new CarEntity(dto.getId(), dto.getModel(), dto.getBrand(), dto.getType(), dto.getPay(),dto.getYear(), dto.getVehicleNum(), dto.getAvailable());
        
        if(carDao.add(carEntity)){
            return "successfully updated";
        }else{
            return "fail";
        }
    }

    @Override
    public String deleteCar(String id) throws Exception {
        if (carDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public CarDto getCar(String id) throws Exception {
        CarEntity entity = carDao.get(id);
        return new CarDto(entity.getId(), entity.getModel(), entity.getBrand(), entity.getType(), entity.getPay(),entity.getYear(), entity.getVehicleNum(), entity.getAvailable());
    }

    @Override
    public ArrayList<CarDto> getAllCar() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAll();
        
        for (CarEntity entity : carEntitys) {
            CarDto dto = new CarDto(entity.getId(), entity.getModel(), entity.getBrand(), entity.getType(), entity.getPay(),entity.getYear(), entity.getVehicleNum(), entity.getAvailable());
            carDtos.add(dto);
        }
        return carDtos;
    
    }
    
    
}
