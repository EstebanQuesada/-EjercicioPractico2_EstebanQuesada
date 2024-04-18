/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.service.Impl;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.dao.EmpleadoDao;
import Hoteles.demo.domain.Empleado;
import Hoteles.demo.service.EmpleadoService;
import java.sql.SQLException;

public class EmpleadoServiceImpl implements EmpleadoService {
    private EmpleadoDao empleadoDao;

    public EmpleadoServiceImpl(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }

    @Override
    public void createEmpleado(Empleado empleado) {
        try {
            empleadoDao.save(empleado);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create employee", e);
        }
    }

    @Override
    public Empleado getEmpleadoById(int id) {
        try {
            return empleadoDao.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to retrieve employee", e);
        }
    }
}