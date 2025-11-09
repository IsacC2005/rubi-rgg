/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author PERSONAL-I3
 */
public class conexion {
    static Connection con = null;
    static String url =  "jdbc:mysql://localhost:3308/ganaderia";
    static String user = "rooto";
    static String clave = "";
    static String base_datos = "";
    public static Connection conectar (){
        try {
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection(url,user,clave);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static String getUser(){
        return user;
    }
     public static String getClave(){
        return clave;
    }
      public static String getDB(){
        return base_datos;
    }
      public static void desconectar (){
          try {
              con.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
 
      }
    public static void errorManager(SQLException e){
        int code = e.getErrorCode();
        String mensaje = e.getMessage();
        
       switch (code) {
		case 1452:
			JOptionPane.showMessageDialog(null, "Cod error: " + code + " Problema con clave foranea");
			break;
		case 1062:
			JOptionPane.showMessageDialog(null, "Cod error: " + code + " Existe un campo duplicado");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Cod error: " + code + " " + mensaje);
			break;
		}
    }
    public static void crearBaseDatos(String nombreBaseDatos) {
        try {
            Statement stmt = con.createStatement();
            String sql = "CREATE DATABASE " + nombreBaseDatos;
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Base de datos '" + nombreBaseDatos + "' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
