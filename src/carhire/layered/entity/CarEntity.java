/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.entity;

import carhire.layered.view.CarCategoryPanel;

/**
 *
 * @author ASUS
 */
public class CarEntity {

    
    private Integer id;
    private String model;
    private String brand;
    private String type;
    private String pay;
    private Integer year;
    private String vehicleNum;
    private String available;
    private CarCategory categoryid;

    public CarEntity() {
    }

    public CarEntity(Integer id, String model, String brand, String type, String pay, Integer year, String vehicleNum, String available) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.pay = pay;
        this.year = year;
        this.vehicleNum = vehicleNum;
        this.available = available;
        
    }

    
  
}
