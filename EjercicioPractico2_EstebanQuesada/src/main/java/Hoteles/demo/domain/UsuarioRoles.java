/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoteles.demo.domain;

/**
 *
 * @author EsteP
 */

public class UsuarioRoles {
    private String usuarioId;
    private int rolId;

    public UsuarioRoles(String usuarioId, int rolId) {
        this.usuarioId = usuarioId;
        this.rolId = rolId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public int getRolId() {
        return rolId;
    }


    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
}