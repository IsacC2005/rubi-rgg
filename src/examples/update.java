/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import common.conexion;

public class update {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        Statement query =null;
        
        try {
            query = con.createStatement();
            int valor = query.executeUpdate("UPDATE usuario SET apellido = 'de la vega' WHERE rol_id = 2");
            System.out.println(valor);
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
    
}
