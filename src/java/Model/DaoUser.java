/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Beans.User;
import Util.Conexion;
import Util.InterfaceCrud;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dante
 */
public class DaoUser extends Conexion implements InterfaceCrud {
    public Connection conn =null;
    public Statement st=null;
    public ResultSet rs=null;
    public boolean encontrado =false;
    public boolean listo=false;
    
    
    public String idU="";
    public String tdoU="";
    public String nomU="";
    public String apeU="";
    public String esU="";
    public String emU="";
    public String rolU="";
    public String espU="";
    
    public DaoUser(User OUser) {
        super();
            try{
              conn = this.ObtenerConexion();
              st = conn.createStatement();
              idU = OUser.getDoUser();
              tdoU = OUser.getTdoUser();
              nomU = OUser.getNoUser();
              apeU = OUser.getApUser();
              esU = OUser.getEsUser();
              emU = OUser.getEmUser();
              rolU = OUser.getRolUser();
              espU = OUser.getEspUser();
            } catch (SQLException ex) {
              Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

          public DaoUser (){
          try {
              conn = this.ObtenerConexion();
              st = conn.createStatement();

              idU = "";
              tdoU = "";
              nomU = "";
              apeU = "";
              esU = "";
              emU="";
              rolU="";
              espU="";
              
          } catch (SQLException ex) {
                Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null,ex);
          }
        }
          
        //@Override
      public boolean agregarRegistro(){
        
      try{
        // Consulta del tipo de documento y su descripcón
        // Select from 
        
      rt=st.executeQuery("Select IdTipoDocumento from tipodocumento where Documento ='"+tdoU+"';");
      rt.next();
      String IdDocumento=rt.getString(1);
      rt=st.executeQuery("Select IdRol from rol where Roles = '"+rolU+"';");
      rt.next();
      String IdRol=rt.getString(1);
      rt=st.executeQuery("Select IdEspecialidad from especialidad where Nombre_Especialidad='"+espU+"';");
      rt.next();
      String IdEspecialidad=rt.getString(1);
      
      //Guardar registros en la tabla Persona
      //Insert into
      st.executeUpdate("insert into usuario (IdDocumento,IdTipoDocumento,Nombre,Apellido,Estado,Email,IdRol,IdEspecialidad) "
      +"values('"+idU+"','"+IdDocumento+"','"+nomU+"','"+apeU+"','"+esU+"','"+emU+"','"+IdRol+"','"+IdEspecialidad+"');");
      listo=true;
      this.CerrarConexion();
      }catch(SQLException ex){
      Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE,null,ex);
      }
       return listo;
      } 
      
      @Override
      public ResultSet consultarRegistro() { // Consulta de Registro método del tipo ResultSet
         try {        
             //Select Inner Join
         rt = st.executeQuery("select IdDocumento, IdTipoDocumento, Nombre, Apellido,  Estado, Email, Contraseña, IdRol, IdEspecialidad from usuario;");
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rt;
    }
      
    @Override
      public boolean actualizarRegistro(){
      try{
       // Consultar El tipo de documento y la descripción
      rt=st.executeQuery("");
       rt.next();
      String idTipoDocumento=rt.getString(1);
      //Bloque de código para actualizar registros 
      st.executeUpdate("");
      listo=true;
      this.CerrarConexion();
      
      }catch(SQLException ex){
          Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE,null ,ex);
   
      }
 
      return listo ;
      }
      
      @Override
        public ResultSet consultarDescripcionTD() {
         try {        
             //Consulta tipo de documento
            rt = st.executeQuery("SELECT Documento FROM tipodocumento;");
            //this.CerrarConexion();   
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rt;
    }
        
        public ResultSet consultarDescripcionRol() {
         try {        
             //Consulta tipo de documento
            rt = st.executeQuery("SELECT Roles FROM rol;");
            //this.CerrarConexion();   
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rt;
    }
        
        public ResultSet consultarDescripcionESP() {
         try {        
             //Consulta tipo de documento
            rt = st.executeQuery("SELECT Nombre_Especialidad FROM especialidad;");
            //this.CerrarConexion();   
        } catch (SQLException ex) {
            Logger.getLogger(DaoUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rt;
    }
        
    
}

