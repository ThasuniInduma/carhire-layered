/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.dao.custom.impl;

import carhire.layered.dao.CrudUtil;
import carhire.layered.dao.custom.CustomerDao;
import carhire.layered.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CustomerDaoImpl implements CustomerDao{

    
    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?)", t.getId(),t.getName(),t.getNic(),t.getAddress(),t.getPhoneNo());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE customer SET Name = ?, NIC = ?, Address = ?, Phone_number = ? WHERE Customer_id = ?",t.getName(),t.getNic(),t.getAddress(),t.getPhoneNo(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE Customer_id = ?",id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM customer WHERE Customer_id = ?", id);
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(5));
            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("SELECT*FROM customer");
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3),
                    rst.getString(4),
                    rst.getString(5));
            customerEntitys.add(customerEntity);
        }
         return customerEntitys;
    }
    
    
}
