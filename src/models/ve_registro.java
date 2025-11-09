/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import common.conexion;
import interfaces.base_sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL-I3
 */
public class ve_registro implements base_sql{
    private Integer id;
    private Integer id_vacuna;
    private Integer id_enfermedad;
    private Integer fecha;
    private Integer id_animal;

    public ve_registro() {
       
    }

    @Override
    public String toString() {
        return "ve_registro{" + "id=" + id + ", id_vacuna=" + id_vacuna + ", id_enfermedad=" + id_enfermedad + ", fecha=" + fecha + '}';
    }
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_vacuna() {
        return id_vacuna;
    }

    public void setId_vacuna(Integer id_vacuna) {
        this.id_vacuna = id_vacuna;
    }

    public Integer getId_enfermedad() {
        return id_enfermedad;
    }

    public void setId_enfermedad(Integer id_enfermedad) {
        this.id_enfermedad = id_enfermedad;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }
    @Override
    public Integer save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Object[]> obtenerRegistros(int idAnimal) {
    List<Object[]> registros = new ArrayList<>();
    
   
    final String SQL = 
        "SELECT v.vacuna AS vacuna, " + 
        "       e.enfermedad AS enfermedad, " +
        "       r.fecha " + 
        "FROM ve_registro r " + 
        "LEFT JOIN vacuna v ON r.id_vacuna = v.id " + 
        "LEFT JOIN enfermedad e ON r.id_enfermedad = e.id " + 
        "WHERE r.id_animal = ?"; 
    try (Connection con = conexion.conectar(); 
         PreparedStatement ps = con.prepareStatement(SQL)) {
        
        ps.setInt(1, idAnimal);
        
        try (ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Object[] fila = new Object[] {
                    rs.getString("vacuna"),  
                    rs.getString("enfermedad"),  
                    rs.getString("fecha")             
                };
                registros.add(fila);
            }
        }
        
    } catch (SQLException e) { 
        System.err.println("Error al obtener registros clínicos: " + e.getMessage());
        e.printStackTrace();
    }
    
    return registros;
}
   private int obtenerIdPorNombre(String nombre, String tabla) {
    int id = -1;
    String columnaNombre;
    
    // 🛑 LÓGICA DE CORRECCIÓN: Usar el nombre de columna correcto según la tabla
    if (tabla.equals("vacuna")) {
        columnaNombre = "vacuna"; // Columna en tabla 'vacuna' es 'vacuna'
    } else if (tabla.equals("enfermedad")) {
        columnaNombre = "enfermedad"; // Columna en tabla 'enfermedad' es 'enfermedad'
    } else {
        return -1; // Nombre de tabla desconocido
    }
    
    // Consulta SQL dinámica con el nombre de columna correcto
    final String SQL = "SELECT id FROM " + tabla + " WHERE " + columnaNombre + " = ?"; 
    
    try (Connection con = conexion.conectar();
         PreparedStatement ps = con.prepareStatement(SQL)) {
        
        ps.setString(1, nombre);
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                id = rs.getInt("id");
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener ID de " + tabla + ": " + e.getMessage());
        e.printStackTrace();
    }
    return id;
}

// Los métodos públicos de conveniencia se mantienen igual
public int obtenerIdVacuna(String nombre) {
    return obtenerIdPorNombre(nombre, "vacuna");
}

public int obtenerIdEnfermedad(String nombre) {
    return obtenerIdPorNombre(nombre, "enfermedad");
}

public boolean saveid(int idAnimal, List<Object[]> registros) {
    
    Connection con = null;
    try {
        con = conexion.conectar();
        con.setAutoCommit(false);
        
        String SQL_DELETE = "DELETE FROM ve_registro WHERE id_animal = ?";
        try (PreparedStatement psDelete = con.prepareStatement(SQL_DELETE)) {
            psDelete.setInt(1, idAnimal);
            psDelete.executeUpdate();
        }
        
        String SQL_INSERT = 
            "INSERT INTO ve_registro (id_animal, id_vacuna, id_enfermedad, fecha) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement psInsert = con.prepareStatement(SQL_INSERT)) {
            for (Object[] fila : registros) {
                
                String nombreMedicina = fila[0].toString();
                String nombreEnfermedad = fila[1].toString();
                String fecha = fila[2].toString(); 
                
                int idVacuna = obtenerIdVacuna(nombreMedicina);
                int idEnfermedad = obtenerIdEnfermedad(nombreEnfermedad);
                
                if (idVacuna == -1 || idEnfermedad == -1) {
                    throw new SQLException("Error: No se encontró el ID para '" + nombreMedicina + "' o '" + nombreEnfermedad + "'. Transacción cancelada.");
                }
                
                psInsert.setInt(1, idAnimal);
                psInsert.setInt(2, idVacuna);       
                psInsert.setInt(3, idEnfermedad);   
                psInsert.setString(4, fecha);      
                
                psInsert.addBatch(); 
            }
            psInsert.executeBatch(); 
        }
        
        con.commit(); 
        return true;
        
    } catch (SQLException e) {
        if (con != null) {
            try {
                con.rollback(); // ❌ Deshace si algo falla
            } catch (SQLException ex) { ex.printStackTrace(); }
        }
        System.err.println("Error al guardar registros: " + e.getMessage());
        e.printStackTrace();
        return false;
    } finally {
        if (con != null) {
            try { con.setAutoCommit(true); con.close(); } catch (SQLException ex) { ex.printStackTrace(); }
        }
    }
}
    
}
