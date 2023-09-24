/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.controller;

import static carhire.layered.service.ServiceFactory.ServiceType.CATEGORY;
import carhire.layered.dto.CarCategoryDto;
import carhire.layered.service.ServiceFactory;
import carhire.layered.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarCategoryController {
    
    CarCategoryService carCategoryService = (CarCategoryService) ServiceFactory.getInstance().getService(CATEGORY);
    
    public String addCategory(CarCategoryDto carCategoryDto) throws Exception {
        return carCategoryService.addCategory(carCategoryDto);
    }
    public ArrayList<CarCategoryDto> getAllCategory() throws Exception {
        return carCategoryService.getAllCategory();
    }
    public String deleteCategory(String id) throws Exception {
        return carCategoryService.deleteCategory(id);
    }

    public CarCategoryDto getCategory(String Category_id) throws Exception {
        return carCategoryService.getCategory(Category_id);
    }
    
}
