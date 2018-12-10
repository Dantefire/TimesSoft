/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultas extends Conexion {
    
    public boolean autenticacion (String usuario,String password){
    PreparedStatement pst=null;
    ResultSet rs =null;
    
    try {
        //String consulta= "select * from aprendiz where usuarioAprendiz = ? and passwordAprendiz = ?";
        String consulta= "select * from usuario where IdDocumento= ? and Contraseña= ?";
        pst=getConexion (). prepareStatement(consulta);
        pst.setString(1, usuario);
        pst.setString(2, password);
        rs=pst.executeQuery();
        
        if(rs.absolute (1)){
            return true;
        }
        
    }catch (Exception e){
        System.err.println("Error" +e);
    }finally{
        
        try{
            if (getConexion ()!=null)getConexion ().close();
            if (pst!= null)pst.close();
            if (rs!=null)rs.close();
                        
        }catch (Exception e){
            System.err.println("Error +e");
        }       
    }
    return false;
    }
}
