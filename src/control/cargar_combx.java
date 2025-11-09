/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import common.conexion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.color;
import models.enfermedad;
import models.pelaje;
import models.raza;
import models.rol;
import models.sexo;
import models.vacuna;
import paneles.Respal;

/**
 *
 * @author PERSONAL-I3
 */
public class cargar_combx {
    
    Connection con = conexion.conectar();
    Statement query = null;
    ResultSet rs = null;

    private Map<String, Integer> sexos= new HashMap<>();
    private Map<String, Integer> razas = new HashMap<>();
    private Map<String, Integer> pelajes = new HashMap<>();
    private Map<String, Integer> colores = new HashMap<>();
    private Map<String, Integer> vacunas = new HashMap<>();
    private Map<String, Integer> enfermedades = new HashMap<>();
    private Map<String, Integer> usua = new HashMap<>();
    
    int idraza = 0, idcolor = 0, idpela = 0, idvacu = 0,idenfer = 0 ;
    int idsex = 0 , traesexo = 0;
     
      public void consul_sexo(JComboBox bus_sex) {
         
         try {
             query = con.createStatement();
              bus_sex.removeAllItems();
            rs = query.executeQuery("SELECT id ,sexo FROM sexo");
              bus_sex.addItem("Seleccione");
             while (rs.next()) {   
                 idsex = rs.getInt("id");
                 String nombresexo = rs.getString("sexo");
                 sexo se = new sexo();
                 se.setId(idsex);
                 se.setSexo(nombresexo);
                 
                 bus_sex.addItem(se);
                 sexos.put(nombresexo, idsex);
             }
             bus_sex.setSelectedIndex(0);
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
        
    }
       public void consul_raz(JComboBox bus_raza) {
         
        try {
             query = con.createStatement();
              bus_raza.removeAllItems();
            rs = query.executeQuery("SELECT id ,raza FROM raza");
              bus_raza.addItem("Seleccione");
             while (rs.next()) {   
                  idraza = rs.getInt("id");
                 String nombreraz = rs.getString("raza");
                 raza ra = new raza();
                 ra.setId(idraza);
                 ra.setRaza(nombreraz);
                 
                 bus_raza.addItem(ra);
                 razas.put(nombreraz, idraza);
             }
            bus_raza.setSelectedIndex(0);
            bus_raza.addItem("Agregar");
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
                
    }
       public int ultimoraza (String nombreraz){
           return this.razas.getOrDefault(nombreraz, -1);
       }
        
    
       public void consul_pelaje(JComboBox bus_pela) {
         
          try {
             query = con.createStatement();
              bus_pela.removeAllItems();
            rs = query.executeQuery("SELECT id ,pelaje FROM pelaje");
              bus_pela.addItem("Seleccione");
             while (rs.next()) {   
                 idpela = rs.getInt("id");
                 String nombrepelaje = rs.getString("pelaje");
                 pelaje pel = new pelaje();
                 pel.setId(idpela);
                 pel.setPelaje(nombrepelaje);
                 
                 bus_pela.addItem(pel);
                 pelajes.put(nombrepelaje, idpela);
             }
            bus_pela.setSelectedIndex(0);
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
                
    }
       
        
    
        public void consul_color(JComboBox bus_color) {
         
         try {
             query = con.createStatement();
              bus_color.removeAllItems();
            rs = query.executeQuery("SELECT id ,color FROM color");
              bus_color.addItem("Seleccione");
             while (rs.next()) {   
                 idcolor = rs.getInt("id");
                 String nombrecolor = rs.getString("color");
                 color cl = new color();
                 cl.setId(idcolor);
                 cl.setColor(nombrecolor);
                 
                 bus_color.addItem(cl);
                 colores.put(nombrecolor, idcolor);
             }
            bus_color.setSelectedIndex(0);
             bus_color.addItem("Agregar");
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
                
    }
        
        public int ultimocolor(String nombrecolor) {
           return this.colores.getOrDefault(nombrecolor, -1); 
        }
        
        public void consul_medi(JComboBox bus_medi) {
         
         try {
             query = con.createStatement();
              bus_medi.removeAllItems();
            rs = query.executeQuery("SELECT id ,vacuna FROM vacuna");
              bus_medi.addItem("Seleccione");
             while (rs.next()) {   
                 idvacu = rs.getInt("id");
                 String nombrevacuna = rs.getString("vacuna");
                 vacuna va = new vacuna();
                 va.setId(idvacu);
                 va.setVacuna(nombrevacuna);
                 
                 bus_medi.addItem(va);
                 colores.put(nombrevacuna, idvacu);
             }
            bus_medi.setSelectedIndex(0);
             bus_medi.addItem("Agregar");
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
                
    }
        
        public int getUltimoIdvacu(String nombrevacuna) {
           return this.colores.getOrDefault(nombrevacuna, -1);
        }
         

   public void consul_enfer(JComboBox bus_enfer) {
         
         try {
             query = con.createStatement();
              bus_enfer.removeAllItems();
            rs = query.executeQuery("SELECT id ,enfermedad FROM enfermedad");
              bus_enfer.addItem("Seleccione");
             while (rs.next()) {   
                  idenfer = rs.getInt("id");
                 String nombreenfer = rs.getString("enfermedad");
                 enfermedad en = new enfermedad();
                 en.setId(idenfer);
                 en.setEnfermedad(nombreenfer);
                 
                 bus_enfer.addItem(en);
                enfermedades.put(nombreenfer, idenfer);
             }
            bus_enfer.setSelectedIndex(0);
            bus_enfer.addItem("Agregar");
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
                
    }
    public int getUltimoIdenfer(String nombreenfer) {
        return this.enfermedades.getOrDefault(nombreenfer, -1);
        }
    
    public void consul_usuario(JComboBox usua_bus) {
         
      try {
             query = con.createStatement();
              usua_bus.removeAllItems();
            rs = query.executeQuery("SELECT id ,roles FROM rol");
              usua_bus.addItem("Seleccione");
             while (rs.next()) {   
                 int idusua = rs.getInt("id");
                 String nombreusua = rs.getString("roles");
                 rol rl = new rol();
                 rl.setId(idusua);
                 rl.setRoles(nombreusua);
                 
                 usua_bus.addItem(rl);
                 usua.put(nombreusua,idusua);
             }
             usua_bus.setSelectedIndex(0);
         } catch (SQLException e) {
             conexion.errorManager(e);
         }finally{
         }
       }
}
