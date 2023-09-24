/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.service.custom.impl;

import carhire.layered.dao.DaoFactory;
import carhire.layered.dao.custom.UserDao;
import carhire.layered.dto.UserDto;
import carhire.layered.entity.UserEntity;
import carhire.layered.service.custom.UserService;

/**
 *
 * @author ASUS
 */
public class UserServiceImpl implements UserService{
    UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public String createAccount(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(dto.getName(), dto.getPassword(), dto.getEmail(), dto.getMobile(), dto.getUsername());
        
        if(userDao.add(userEntity)){
            return "successfully added";
        }else{
            return "fail";
        }
    }
}
