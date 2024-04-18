/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.controller;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.domain.Empleado;
import Hoteles.demo.service.EmpleadoService;

public class EmpleadoController {
    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    public void addEmpleado(String nombre, String cargo, int hotelId) {
        Empleado empleado = new Empleado(0, nombre, cargo, hotelId); 
        empleadoService.createEmpleado(empleado);
    }

    public Empleado findEmpleadoById(int id) {
        return empleadoService.getEmpleadoById(id);
    }
}