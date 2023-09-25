/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.dao.custom.impl;
import java.sql.ResultSet;
import carhire.layered.dao.CrudUtil;
import carhire.layered.dao.custom.CarDao;
import carhire.layered.entity.CarEntity;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CarDaoImpl implements CarDao{
    
    @Override
    public boolean add(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO car(Id, Model, Brand, Type, Price_per_day, Year, Vehicle_number, Is_Available) VALUES(?,?,?,?,?,?,?,?)", t.getId(), t.getModel(), t.getBrand(),t.getType(), t.getPay(), t.getYear(), t.getVehicleNum(), t.getAvailable());
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE car SET Model = ?, Brand = ?, Type = ?, Price_per_day = ?, Year = ?, Vehicle_number = ?, Is_Available = ? WHERE Id = ?",t.getModel(),t.getBrand(), t.getType(), t.getPay(), t.getYear(), t.getVehicleNum(),t.getAvailable(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM car WHERE Id = ?",id);
    }

    public CarEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM car WHERE Id = ?", id);
        
        while (rst.next()) {            
            CarEntity carEntity = new CarEntity(rst.getInt(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6),
                    rst.getString(7),
                    rst.getString(8));
            return carEntity;
        }
        return null;
    }

    public ArrayList<CarEntity> getAll() throws Exception {
        ArrayList<CarEntity> carEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM car");
        while (rst.next()) {            
            CarEntity carEntity = new CarEntity(rst.getInt(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6),
                    rst.getString(7),
                    rst.getString(8));
            carEntitys.add(carEntity);
        }
         return carEntitys;
    }
}
