/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.conexion;

public class request_prepared {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            query = con.prepareStatement("SELECT * FROM usuario WHERE cedula = ?");
            query.setInt(1,4572112);
            
            rs = query.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getInt("cedula") + ", "+rs.getString("nombre"));
                
            }
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
}
