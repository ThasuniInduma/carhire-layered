/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.service;


import carhire.layered.dao.DaoFactory;
import carhire.layered.service.custom.UserService;
import carhire.layered.service.custom.impl.CarCategoryServiceImpl;
import carhire.layered.service.custom.impl.CarServiceImpl;
import carhire.layered.service.custom.impl.CustomerServiceImpl;
import carhire.layered.service.custom.impl.UserServiceImpl;

/**
 *
 * @author ASUS
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){
        
    }
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
            
        }
        return serviceFactory;
    }
    public SuperService getService(ServiceType type){
        switch(type){
            case CUSTOMER:
                return new CustomerServiceImpl();
            case CAR:
                return new CarServiceImpl();
            case USER:
                return new UserServiceImpl();
            case CATEGORY:
                return new CarCategoryServiceImpl();
            default:
                return null;
        }
    }

    
    public enum ServiceType{
        CUSTOMER, CAR, USER, CATEGORY// ORDER
    }
}
