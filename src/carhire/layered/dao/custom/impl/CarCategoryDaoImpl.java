/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.dao.custom.impl;

import carhire.layered.dao.CrudUtil;
import carhire.layered.dao.custom.CarCategoryDao;
import carhire.layered.entity.CarCategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class CarCategoryDaoImpl implements CarCategoryDao{
    
    @Override
    public boolean add(CarCategoryEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO car_category(id, Name) VALUES(?,?)", t.getId(),t.getName());
    }
    
    @Override
   public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM car_category WHERE Id = ?",id);
    }

    @Override
    public CarCategoryEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM car_category WHERE Id = ?", id);
        
        while (rst.next()) {            
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getInt(1),
                    rst.getString(2));
            return carCategoryEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CarCategoryEntity> getAll() throws Exception {
        ArrayList<CarCategoryEntity> carCategoryEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM car_category");
        while (rst.next()) {            
            CarCategoryEntity carCategoryEntity = new CarCategoryEntity(rst.getInt(1),
                    rst.getString(2));
            carCategoryEntitys.add(carCategoryEntity);
        }
         return carCategoryEntitys;
    }

    @Override
    public boolean update(CarCategoryEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
