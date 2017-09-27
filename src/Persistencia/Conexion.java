package Persistencia;

import java.sql.*;

/**
 * Created by smoya on 27/09/2017.
 */
public class Conexion {
    private Statement statement;
    private Connection connection;
    private String jdbc;
    private String ruta;
    private String usuario;
    private String pass;

    public Conexion(){

        this.connection = null;
        this.statement = null;
        this.jdbc = "com.mysql.jdbc.Driver";
        this.ruta = "jdbc:mysql://localhost:3306/db";
        this.usuario ="root";
        this.pass ="root";

    }

    private void abrirConexion(){

        try {

            Class.forName(this.jdbc);
            this.connection = DriverManager.getConnection(this.ruta,this.usuario, this.pass);
            this.statement = this.connection.createStatement();

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String ejecutar(String sentencia){
        try {

            this.abrirConexion();
            this.statement.executeUpdate(sentencia);
            return "Op Exitosa";

        }catch (SQLException e){
            return e.toString();
        }
    }
    public ResultSet consultar(String sentencia){
        ResultSet resultado = null;
        try {
            this.abrirConexion();
            resultado = statement.executeQuery(sentencia);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultado;
    }

}
