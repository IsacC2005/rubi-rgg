/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import common.conexion;

public class insert {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        Statement sentencia = null;
        try {
            sentencia = con.createStatement();
            int valor = sentencia.executeUpdate("INSERT INTO `usuario` VALUES (NULL, '2009', 'michel', 'mastro', 'michel@gmail.com', '1234', '2')");
            System.out.println(valor);
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
}
