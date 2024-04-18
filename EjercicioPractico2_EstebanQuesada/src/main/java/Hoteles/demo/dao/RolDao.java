/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoteles.demo.dao;



import Hoteles.demo.domain.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RolDao {
    private Connection connection;

    public RolDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Rol rol) throws SQLException {
        String sql = "INSERT INTO roles (nombre) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, rol.getNombre());
            stmt.executeUpdate();
        }
    }

    public Rol findById(int id) throws SQLException {
        String sql = "SELECT * FROM roles WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Rol(rs.getInt("id"), rs.getString("nombre"));
            }
        }
        return null;
    }
}