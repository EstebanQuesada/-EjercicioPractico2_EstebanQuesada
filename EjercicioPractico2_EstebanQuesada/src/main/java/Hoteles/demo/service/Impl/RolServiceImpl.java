/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.service.Impl;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.dao.RolDao;
import Hoteles.demo.domain.Rol;
import Hoteles.demo.service.RolService;
import java.sql.SQLException;

public class RolServiceImpl implements RolService {
    private RolDao rolDao;

    public RolServiceImpl(RolDao rolDAO) {
        this.rolDao = rolDAO;
    }

    @Override
    public void addRole(Rol rol) {
        try {
            rolDao.save(rol);
        } catch (SQLException e) {
           
            throw new RuntimeException(e);
        }
    }

    @Override
    public Rol getRoleById(int id) {
        try {
            return rolDao.findById(id);
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }
}