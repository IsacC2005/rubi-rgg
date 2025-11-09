/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import common.conexion;
import interfaces.base_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL-I3
 */
public class raza implements base_sql{
    
    private Integer id;
    private String raza;

    @Override
    public String toString() {
        return raza;
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    raza other = (raza) obj;
    return this.id == other.id;
}

    @Override
    public Integer save() {
        Connection con = conexion.conectar();
       PreparedStatement query = null;
        try {
            query = con.prepareStatement("INSERT INTO " + "`raza` VALUES (NULL,?)");
            query.setString(1, this.raza);
            query.execute();
            
            
        } catch (SQLException e) {
            conexion.errorManager(e);
            JOptionPane.showMessageDialog(null, "Raza Existente en la Base de Datos");
        } finally {
            conexion.desconectar();
        }
        return null;
    }

    @Override
    public Integer update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void metodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void requestOne(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int requestOne(String raza) {
      Connection con = conexion.conectar();
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            query = con.prepareStatement("SELECT * FROM raza WHERE raza = ? ");
            query.setString(1, raza);
            rs = query.executeQuery();
            if (rs.next()) {
                this.setRaza(rs.getString("raza"));
                
            }
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
        return 0;
    }
    
}
