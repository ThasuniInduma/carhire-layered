/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.layered.service.custom;

import carhire.layered.dto.CarCategoryDto;
import carhire.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CarCategoryService extends SuperService{
    String addCategory(CarCategoryDto carCategoryDto) throws Exception;
    String deleteCategory(String id) throws Exception;
    CarCategoryDto getCategory(String id) throws Exception;
    ArrayList<CarCategoryDto> getAllCategory() throws Exception;
}
