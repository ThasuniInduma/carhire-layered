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
    private Integer categoryid;

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

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return the vehicleNum
     */
    public String getVehicleNum() {
        return vehicleNum;
    }

    /**
     * @param vehicleNum the vehicleNum to set
     */
    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    /**
     * @return the available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * @return the categoryid
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid the categoryid to set
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "id=" + id + ", model=" + model + ", brand=" + brand + ", type=" + type + ", pay=" + pay + ", year=" + year + ", vehicleNum=" + vehicleNum + ", available=" + available + ", categoryid=" + categoryid + '}';
    }
    
    
  
}
