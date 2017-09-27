/**
 * Created by smoya on 25/09/2017.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Acceso a la base de datos de Cuentas Corrientes Obras Sociales*/
public class DbAccess {
    public static void main(String[] argumentos) {
        Connection conexion = null;
//      Manejo de excepciones de la conexion.
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String pass = "root";

            conexion = DriverManager.getConnection(url, user, pass);
            if (conexion != null) {
                System.out.println("La conexion se realizo con exito!");

            }

        }catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
