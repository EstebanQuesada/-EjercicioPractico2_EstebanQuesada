/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.controller;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.domain.Usuario;
import Hoteles.demo.service.UsuarioService;

public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void createUser(String username, String password) {
        Usuario usuario = new Usuario(username, password, true);
        usuarioService.registerUser(usuario);
    }

    public Usuario loginUser(String username, String password) {
        return usuarioService.loginUser(username, password);
    }
}