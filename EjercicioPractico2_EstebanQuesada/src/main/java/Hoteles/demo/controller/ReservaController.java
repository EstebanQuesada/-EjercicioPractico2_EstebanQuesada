/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.controller;

/**
 *
 * @author EsteP
 */
import Hoteles.demo.domain.Reserva;
import Hoteles.demo.service.ReservaService;

import java.util.Date;

public class ReservaController {
    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    public void addReserva(String clienteNombre, int numHuespedes, Date fechaIngreso, Date fechaSalida, int hotelId, String numeroCedula) {
        Reserva reserva = new Reserva(0, clienteNombre, numHuespedes, fechaIngreso, fechaSalida, hotelId, numeroCedula);
        reservaService.createReserva(reserva);
    }

    public Reserva findReservaById(int id) {
        return reservaService.getReservaById(id);
    }
}