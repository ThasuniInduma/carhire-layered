/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire.layered.service.custom;

import carhire.layered.dto.UserDto;
import carhire.layered.service.SuperService;

/**
 *
 * @author ASUS
 */
public interface UserService extends SuperService{
     String createAccount(UserDto userDto) throws Exception;
}
