/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.service;

/**
 *
 * @author EsteP
 */


import Hoteles.demo.domain.Usuario;

public interface UsuarioService {
    void registerUser(Usuario usuario);
    Usuario loginUser(String username, String password);
}