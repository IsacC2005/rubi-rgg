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
public class enfermedad implements base_sql{
    private Integer id;
    private String enfermedad;

    @Override
    public String toString() {
        return  enfermedad;
    }
  
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    

    @Override
    public Integer save() {
       Connection con = conexion.conectar();
       PreparedStatement query = null;
        try {
            query = con.prepareStatement("INSERT INTO " + "`enfermedad` VALUES (NULL,?)");
            query.setString(1, this.enfermedad);
            query.execute();
            
            
        } catch (SQLException e) {
            conexion.errorManager(e);
            JOptionPane.showMessageDialog(null, "enfermedad Existente en la Base de Datos");
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
    
    public void requestOne(String enfermedad) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            query = con.prepareStatement("SELECT * FROM enfermedad WHERE enfermedad = ? ");
            query.setString(1, enfermedad);
            rs = query.executeQuery();
            if (rs.next()) {
                this.setEnfermedad(rs.getString("enfermedad"));
                
            }
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
        
    }
    
    
}
