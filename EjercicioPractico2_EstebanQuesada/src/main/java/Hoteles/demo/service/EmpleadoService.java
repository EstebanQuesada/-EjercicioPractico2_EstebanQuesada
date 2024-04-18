/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.service;

/**
 *
 * @author EsteP
 */
import Hoteles.demo.domain.Empleado;

public interface EmpleadoService {
    void createEmpleado(Empleado empleado);
    Empleado getEmpleadoById(int id);
}