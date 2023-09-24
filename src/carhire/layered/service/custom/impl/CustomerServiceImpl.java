/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.service.custom.impl;

import carhire.layered.dao.DaoFactory;
import carhire.layered.dao.custom.CustomerDao;
import carhire.layered.dto.CustomerDto;
import carhire.layered.entity.CustomerEntity;
import carhire.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(dto.getId(), dto.getName(), dto.getNic(), dto.getAddress(), dto.getPhoneNo());
        
        if(customerDao.add(customerEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(dto.getId(), dto.getName(), dto.getNic(), dto.getAddress(), dto.getPhoneNo());
        
        if(customerDao.update(customerEntity)){
            return "successfully updated";
        }else{
            return "fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if (customerDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        return new CustomerDto(entity.getId(),entity.getName(),entity.getNic(),entity.getAddress(),entity.getPhoneNo());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getId(),entity.getName(),entity.getNic(),entity.getAddress(),entity.getPhoneNo());
            customerDtos.add(dto);
        }
        return customerDtos;
    
    }
    
}
