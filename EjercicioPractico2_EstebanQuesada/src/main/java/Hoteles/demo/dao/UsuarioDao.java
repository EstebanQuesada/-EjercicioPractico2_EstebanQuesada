/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.dao;



import Hoteles.demo.domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {
    private Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (username, password, enabled) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setBoolean(3, usuario.isEnabled());
            stmt.executeUpdate();
        }
    }

    public Usuario findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getString("username"), rs.getString("password"), rs.getBoolean("enabled"));
            }
        }
        return null;
    }
}