/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.conexion;

public class request {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        Statement query = null;
        ResultSet rs = null;
        
        try {
            query = con.createStatement();
            rs = query.executeQuery("SELECT * FROM usuario WHERE nombre LIKE 'jose'");
            
            while (rs.next()) {
                System.out.println(rs.getInt("cedula")+"," +rs.getString("nombre"));
                
            }
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
                
    }
}
