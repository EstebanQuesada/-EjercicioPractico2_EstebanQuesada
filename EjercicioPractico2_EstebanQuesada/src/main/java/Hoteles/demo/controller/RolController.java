/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.controller;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.domain.Rol;
import Hoteles.demo.service.RolService;

public class RolController {
    private RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    public void createRole(String nombre) {
        Rol rol = new Rol(0, nombre); 
        rolService.addRole(rol);
    }

    public Rol findRoleById(int id) {
        return rolService.getRoleById(id);
    }
}