/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.service;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.domain.Hotel;

public interface HotelService {
    void createHotel(Hotel hotel);
    Hotel getHotelById(int id);
}