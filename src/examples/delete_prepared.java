/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author PERSONAL-I3
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.conexion;

public class delete_prepared {
    public static void main(String[] args) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        try {
            query = con.prepareStatement("DELETE FROM usuario WHERE id = ? ");
            query.setInt(1,95);
            query.execute();
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
}
