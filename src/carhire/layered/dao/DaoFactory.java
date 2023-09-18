/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.dao;

import carhire.layered.dao.custom.impl.CustomerDaoImpl;

/**
 *
 * @author ASUS
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
                
            default:
                return null;
        }
    }

    
    public enum DaoTypes{
        CUSTOMER
    }
}