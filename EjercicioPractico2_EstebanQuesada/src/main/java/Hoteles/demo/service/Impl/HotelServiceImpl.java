/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.service.Impl;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.dao.HotelDao;
import Hoteles.demo.domain.Hotel;
import Hoteles.demo.service.HotelService;
import java.sql.SQLException;

public class HotelServiceImpl implements HotelService {
    private HotelDao hotelDao;

    public HotelServiceImpl(HotelDao hotelDAO) {
        this.hotelDao = hotelDAO;
    }

    @Override
    public void createHotel(Hotel hotel) {
        try {
            hotelDao.save(hotel);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create hotel", e);
        }
    }

    @Override
    public Hotel getHotelById(int id) {
        try {
            return hotelDao.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to retrieve hotel", e);
        }
    }
}