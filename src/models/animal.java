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
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL-I3
 */
public class animal implements base_sql {

    private Integer id;
    private Integer codigo;
    private String fechanacimiento;
    private String nombre;
    private Double peso;
    private Integer id_raza;
    private Integer madre;
    private Integer padre;
    private Integer id_sexo;
    private Integer id_color;
    private Integer id_pelaje;

    @Override
    public String toString() {
        return "animal{" + "id=" + id + ", codigo=" + codigo + ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre + ", peso=" + peso + ", id_raza=" + id_raza + ", madre=" + madre + ", padre=" + padre + ", id_sexo=" + id_sexo + ", id_color=" + id_color + ", id_pelaje=" + id_pelaje + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getId_raza() {
        return id_raza;
    }

    public void setId_raza(Integer id_raza) {
        this.id_raza = id_raza;
    }

    public Integer getMadre() {
        return madre;
    }

    public void setMadre(Integer madre) {
        this.madre = madre;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }

    public Integer getId_sexo() {
        return id_sexo;
    }

    public void setId_sexo(Integer id_sexo) {
        this.id_sexo = id_sexo;
    }

    public Integer getId_color() {
        return id_color;
    }

    public void setId_color(Integer id_color) {
        this.id_color = id_color;
    }

    public Integer getId_pelaje() {
        return id_pelaje;
    }

    public void setId_pelaje(Integer id_pelaje) {
        this.id_pelaje = id_pelaje;
    }

    @Override
    public Integer save() {

        Connection con = conexion.conectar();
        PreparedStatement query = null;
        try {
            query = con.prepareStatement("INSERT INTO " + "`animal` VALUES (NULL,?,?,?,?,?,?,?,?,?,?)");
            query.setInt(1, this.codigo);
            query.setString(2, this.fechanacimiento);
            query.setString(3, this.nombre);
            query.setDouble(4, this.peso);
            query.setInt(5, this.id_raza);
            query.setInt(6, this.madre);
            query.setInt(7, this.padre);
            query.setInt(8, this.id_sexo);
            query.setInt(9, this.id_color);
            query.setInt(10, this.id_pelaje);
            query.execute();

        } catch (SQLException e) {
            conexion.errorManager(e);
            JOptionPane.showMessageDialog(null, "Color Existente en la Base de Datos");
        } finally {
            conexion.desconectar();
        }
        return null;
    }

    @Override
    public Integer update() {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        try {
            query = con.prepareStatement("UPDATE animal SET peso = ? WHERE codigo = ?");
            query.setDouble(1, this.getPeso());
            query.setInt(2, this.getCodigo());

            query.execute();

        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
        return null;
    }

    @Override
    public void metodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void requestOne(Integer id) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;
        ResultSet rs = null;
        try {
            query = con.prepareStatement("SELECT * FROM animal WHERE codigo = ?");
            query.setInt(1, id);
            rs = query.executeQuery();
            if (rs.next()) {
                this.setId(rs.getInt("id"));
                this.setCodigo(rs.getInt("codigo"));
                this.setFechanacimiento(rs.getString("fechanacimiento"));
                this.setNombre(rs.getString("nombre"));
                this.setPeso(rs.getDouble("peso"));
                this.setId_raza(rs.getInt("id_raza"));
                this.setMadre(rs.getInt("madre"));
                this.setPadre(rs.getInt("padre"));
                this.setId_sexo(rs.getInt("id_sexo"));
                this.setId_color(rs.getInt("id_color"));
                this.setId_pelaje(rs.getInt("id_pelaje"));
            }
        } catch (SQLException e) {
            conexion.errorManager(e);
        } finally {
            conexion.desconectar();
        }
    }

    @Override
    public Integer delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int deleteuno(int codigo) {
        Connection con = conexion.conectar();
        PreparedStatement query = null;

        try {
            query = con.prepareStatement("DELETE FROM animal WHERE codigo = ?");
            query.setInt(1, codigo);
            int filas = query.executeUpdate();

            if (filas > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException e) {
            conexion.errorManager(e);
            return -1; // error al eliminar
        } finally {
            try {
                if (query != null) {
                    query.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
