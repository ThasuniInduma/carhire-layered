/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.controller;
import static carhire.layered.service.ServiceFactory.ServiceType.USER;
import carhire.layered.dto.UserDto;
import carhire.layered.service.ServiceFactory;
import carhire.layered.service.custom.UserService;

/**
 *
 * @author ASUS
 */
public class UserController {
    UserService userService = (UserService) ServiceFactory.getInstance().getService(USER);
    
    public String createAccount(UserDto userDto) throws Exception {
        return userService.createAccount(userDto);
    }
    
}
