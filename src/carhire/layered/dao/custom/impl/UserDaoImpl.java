/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire.layered.dao.custom.impl;

import carhire.layered.dao.CrudUtil;
import carhire.layered.dao.custom.UserDao;
import carhire.layered.db.DBConnection;
import carhire.layered.entity.UserEntity;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class UserDaoImpl implements UserDao{
    
    @Override
    public boolean add(UserEntity t) throws Exception {
    
    return CrudUtil.executeUpdate("INSERT INTO user(name, password, email, mobile, username) VALUES(?,?,?,?,?)", t.getName(), t.getPassword(), t.getEmail(),t.getMobile(),t.getUsername());    }
    
    @Override
    public boolean update(UserEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
