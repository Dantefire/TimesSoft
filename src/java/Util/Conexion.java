/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion {
        
public String driver;
public String urlbd;
public String usrbd;
public String passbd;

public Connection conn=null;
public Statement st=null;
public  ResultSet rt=null;
public Connection conexion;

    // metodo Constructor para la conexion
    public Conexion(){
        driver="com.mysql.cj.jdbc.Driver";
        usrbd ="root";
        passbd ="123456";
        urlbd="jdbc:mysql://127.0.0.1:3307/timessoft?useTimezone=true&serverTimezone=UTC&useSSL=false";

    ResultSet tabla = null;           
        try
        { 
            
        Class.forName(driver).newInstance();
        conexion=DriverManager.getConnection(urlbd,usrbd,passbd);
        System.out.println("Conexion a Base de Datos realizada");
        }
        catch (Exception e){
            System.out.println("Errrrrrror al tratar de abrir la base de Datos"+e);
        }
    }

    public Connection ObtenerConexion()
    { return conexion;
    }

    public Connection CerrarConexion() throws SQLException
    { 
      conexion.close();
      conexion = null;
      return conexion;
    }
    public Connection getConexion (){
        return conexion;
        
    }
    public static void main(String[] args) {
        Conexion con =new Conexion();
        
        System.out.println(" "+con);
        
    }

} // fin de la clase