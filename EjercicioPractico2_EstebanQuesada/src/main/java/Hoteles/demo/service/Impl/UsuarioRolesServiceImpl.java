/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.service.Impl;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.dao.UsuarioRolesDao;
import Hoteles.demo.domain.UsuarioRoles;
import Hoteles.demo.service.UsuarioRolesService;
import java.sql.SQLException;

public class UsuarioRolesServiceImpl implements UsuarioRolesService {
    private UsuarioRolesDao usuarioRolesDao;

    public UsuarioRolesServiceImpl(UsuarioRolesDao usuarioRolesDAO) {
        this.usuarioRolesDao = usuarioRolesDAO;
    }

    @Override
    public void assignRoleToUser(UsuarioRoles usuarioRoles) {
        try {
            usuarioRolesDao.addUsuarioRol(usuarioRoles);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to assign role to user", e);
        }
    }
}