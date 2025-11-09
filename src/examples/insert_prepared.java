/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.conexion;
public class insert_prepared {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        try {
            query = con.prepareStatement("INSERT INTO `usuario` VALUES (NULL, ?, ?, ?, ?, ?, ?)");
            query.execute();
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
}
