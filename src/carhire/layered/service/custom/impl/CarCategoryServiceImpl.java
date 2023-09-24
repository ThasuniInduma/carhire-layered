/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.service.custom.impl;

import carhire.layered.dao.DaoFactory;
import carhire.layered.dao.custom.CarCategoryDao;
import carhire.layered.dao.custom.CarDao;
import carhire.layered.dto.CarCategoryDto;
import carhire.layered.entity.CarCategoryEntity;
import carhire.layered.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarCategoryServiceImpl implements CarCategoryService{

    CarCategoryDao carCategoryDao = (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);
    
    @Override
    public String addCategory(CarCategoryDto dto) throws Exception {
        CarCategoryEntity carCategoryEntity = new CarCategoryEntity(dto.getId(), dto.getName());
        
        if(carCategoryDao.add(carCategoryEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }

    @Override
    public String deleteCategory(String id) throws Exception {
        if (carCategoryDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public CarCategoryDto getCategory(String id) throws Exception {
        CarCategoryEntity entity = carCategoryDao.get(id);
        return new CarCategoryDto(entity.getId(), entity.getName());
    }

    @Override
    public ArrayList<CarCategoryDto> getAllCategory() throws Exception {
         ArrayList<CarCategoryDto> carCategoryDtos = new ArrayList<>();
        ArrayList<CarCategoryEntity> carCategoryEntitys = carCategoryDao.getAll();
        
        for (CarCategoryEntity entity : carCategoryEntitys) {
            CarCategoryDto dto = new CarCategoryDto(entity.getId(), entity.getName());
            carCategoryDtos.add(dto);
        }
        return carCategoryDtos;
    
    }
    
    
    
}
