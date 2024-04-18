/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.dao;

/**
 *
 * @author EsteP
 */
import  Hoteles.demo.domain.UsuarioRoles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioRolesDao {
    private Connection connection;

    public UsuarioRolesDao(Connection connection) {
        this.connection = connection;
    }

    public void addUsuarioRol(UsuarioRoles usuarioRoles) throws SQLException {
        String sql = "INSERT INTO usuario_roles (usuario_id, rol_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuarioRoles.getUsuarioId());
            stmt.setInt(2, usuarioRoles.getRolId());
            stmt.executeUpdate();
        }
    }

}