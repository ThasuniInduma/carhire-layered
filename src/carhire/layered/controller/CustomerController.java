/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.controller;

import carhire.layered.dto.CustomerDto;
import carhire.layered.service.ServiceFactory;
import static carhire.layered.service.ServiceFactory.ServiceType.CUSTOMER;
import carhire.layered.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(CUSTOMER);
    
    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String Customer_id) throws Exception {
        return customerService.getCustomer(Customer_id);
    }
}
