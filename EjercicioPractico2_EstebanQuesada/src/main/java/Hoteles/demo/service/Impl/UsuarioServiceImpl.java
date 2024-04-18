/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.service.Impl;

/**
 *
 * @author EsteP
 */

import Hoteles.demo.dao.UsuarioDao;
import Hoteles.demo.domain.Usuario;
import Hoteles.demo.service.UsuarioService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioDao usuarioDao;

    public UsuarioServiceImpl(UsuarioDao usuarioDAO) {
        this.usuarioDao = usuarioDAO;
    }

    @Override
    public void registerUser(Usuario usuario) {
        try {
             usuarioDao.save(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Usuario loginUser(String username, String password) {

        Usuario usuario = null;
        try {
            usuario = usuarioDao.findByUsername(username);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        }
        return null;
    }
}