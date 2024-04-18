/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.controller;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.domain.UsuarioRoles;
import Hoteles.demo.service.UsuarioRolesService;

public class UsuarioRolesController {
    private UsuarioRolesService usuarioRolesService;

    public UsuarioRolesController(UsuarioRolesService usuarioRolesService) {
        this.usuarioRolesService = usuarioRolesService;
    }

    public void assignRole(String usuarioId, int rolId) {
        UsuarioRoles usuarioRoles = new UsuarioRoles(usuarioId, rolId);
        usuarioRolesService.assignRoleToUser(usuarioRoles);
    }
}