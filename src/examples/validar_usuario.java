/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import common.conexion;
import models.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PERSONAL-I3
 */
public class validar_usuario {
    
    public usuario obtenerusuario(usuario us){
        Connection con = conexion.conectar();
        usuario usua = null;
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            String sql ="SELECT *, id_rol FROM usuario WHERE usuario.cedula = "+us.getCedula()+" and usuario.password = '"+us.getPassword()+"'";
            query = con.prepareStatement(sql);
            rs = query.executeQuery();
            while (rs.next()) {
                usua = new usuario(rs.getInt("id"), rs.getInt("cedula"), rs.getString("nombre"),rs.getString("password"), rs.getString("confi_password"), rs.getString("comida_favorita"), rs.getString("animal_favorito"), rs.getString("color_favorito"), rs.getInt("id_rol"));
                
            }
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
        return usua;
    }
    
    public usuario obtenerpregunta (usuario pregun){
        Connection con = conexion.conectar();
        usuario usua1 = null;
        PreparedStatement query = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM usuario WHERE usuario.cedula="+pregun.getCedula()+" and usuario.comida_favorita = '"+pregun.getComida_favorita()+"' and usuario.animal_favorito = '"+pregun.getAnimal_favorito()+"' and usuario.color_favorito = '" + pregun.getColor_favorito()+ "'";
            query = con.prepareStatement(sql);
            rs = query.executeQuery();
            while (rs.next()) {
                usua1 = new usuario();
                        
                
            }
            
        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
        return usua1;
    }
    
}
