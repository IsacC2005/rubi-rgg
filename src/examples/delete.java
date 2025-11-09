
package examples;


import common.conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PERSONAL-I3
 */
public class delete {
    public static void main(String[] args) {
       Connection con = conexion.conectar();
       Statement query = null;
        try {
            query = con.createStatement();
            int valor = query.executeUpdate("DELETE FROM usuario WHERE rol_id = 1");
        } catch (SQLException e) {
            conexion.errorManager(e);
        }finally{
            conexion.desconectar();
        }
    }
    
}
