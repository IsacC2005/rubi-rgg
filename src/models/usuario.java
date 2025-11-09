/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import common.conexion;
import interfaces.base_sql;

/**
 *
 * @author PERSONAL-I3
 */
public class usuario implements base_sql{
    private Integer id;
    private Integer cedula;
    private String nombre;
    private String password;
    private String confi_password;
    private String comida_favorita;
    private String animal_favorito;
    private String color_favorito;
    private Integer id_rol;

    public usuario(Integer id, Integer cedula, String nombre, String password,String confi_password, String comida_favorita, String animal_favorito, String color_favorito, Integer id_rol) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.confi_password = confi_password;
        this.comida_favorita = comida_favorita;
        this.animal_favorito = animal_favorito;
        this.color_favorito = color_favorito;
        this.id_rol = id_rol;
    }

    public usuario() {
        
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", password=" + password + ", confi_password=" + confi_password + ", comida_favorita=" + comida_favorita + ", animal_favorito=" + animal_favorito + ", color_favorito=" + color_favorito + ", id_rol=" + id_rol + '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfi_password() {
        return confi_password;
    }

    public void setConfi_password(String confi_password) {
        this.confi_password = confi_password;
    }

    public String getComida_favorita() {
        return comida_favorita;
    }

    public void setComida_favorita(String comida_favorita) {
        this.comida_favorita = comida_favorita;
    }

    public String getAnimal_favorito() {
        return animal_favorito;
    }

    public void setAnimal_favorito(String animal_favorito) {
        this.animal_favorito = animal_favorito;
    }


    public String getColor_favorito() {
        return color_favorito;
    }

    public void setColor_favorito(String color_favorito) {
        this.color_favorito = color_favorito;
    }
    
    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    

    @Override
    public Integer save() {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        try {
            query = con.prepareStatement("INSERT INTO " + "`usuario` VALUES (NULL,?,?,?,?,?,?,?,?)");
            query.setInt(1, this.getCedula());
            query.setString(2, this.getNombre());
            //query.setString(3, this.getApllido());
            query.setString(3, this.getPassword());
            query.setString(4, this.getConfi_password());
            query.setString(5, this.getComida_favorita());
            query.setString(6, this.getColor_favorito());
            query.setString(7, this.getAnimal_favorito());
            query.setInt(8, this.getId_rol());
            query.execute();
        } catch (SQLException e) {
            conexion.errorManager(e);
            JOptionPane.showMessageDialog(null, "Usuario Existente En la base de Datos, Se regresara al menu para evitar inconcluencia de datos");
        } finally {
            conexion.desconectar();
        }
        return null;
    }

    @Override
    public Integer update() {
        Connection con = conexion.conectar();
        PreparedStatement query2 = null;
       try {
            query2 = con.prepareStatement("UPDATE usuario SET password=? ,confi_password=? WHERE cedula=?");
            query2.setInt(1, this.getCedula());
            query2.setString(2, this.getPassword());
            query2.setString(3, this.getConfi_password());
            
            query2.execute();
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
        return null;
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
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        ResultSet rs = null;
        
        try {
            query = con.prepareStatement("SELECT * FROM usuario WHERE cedula = ? ");
            query.setInt(2, cedula);
            rs = query.executeQuery();
            
            if (rs.next()) {
                this.setId(rs.getInt("id"));
                this.setCedula(rs.getInt("cedula"));
                this.setNombre(rs.getString("nombre"));
                this.setPassword(rs.getString("password"));
                this.setConfi_password(rs.getString("confi_password_"));
                this.setComida_favorita(rs.getString("comida_favotita"));
                this.setAnimal_favorito(rs.getString("animal_favorito"));
                this.setColor_favorito(rs.getString("color_favorito"));
                
            }
        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
        
    }

   
}
    
    

