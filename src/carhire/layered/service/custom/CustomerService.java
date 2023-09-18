/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.layered.service.custom;

import carhire.layered.dto.CustomerDto;
import carhire.layered.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(String id) throws Exception;
    CustomerDto getCustomer(String id) throws Exception;
    ArrayList<CustomerDto> getAllCustomer() throws Exception;
}
