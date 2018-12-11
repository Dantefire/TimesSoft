/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Servlet;

import Controller.Beans.User;
import Model.DaoUser;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ServletUser", urlPatterns ={"/user.do"})
public class ServletUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        int opcion= Integer.parseInt(request.getParameter("txtOpcion"));
        
        //Declaración variables que guardaran los datos de los objetos de la pagina JSP
        String iddocumento=request.getParameter("idduser");
        String nombre=request.getParameter("nombreuser");
        String apellido=request.getParameter("apelliuser");
        String estado=request.getParameter("estadouser");
        String email=request.getParameter("emailuser");
        
        // se captura la descripcion  del tema  para hallar su respectivo ID
        String IdTipoDocumento=request.getParameter("selettdoc");
        String IdRol =request.getParameter("seletrol");
        String IdEspecialidad = request.getParameter("seletesp");
        
        //instanciar la clase Bean
        User BUser=new User(iddocumento,IdTipoDocumento,nombre,apellido,estado,email,IdRol,IdEspecialidad);
        
        //se instancia la clase Dao pasando el objeto del Bean
        DaoUser DUser=new DaoUser(BUser);
        
        //Declaramos El ResultSet
        ResultSet rs;
        
        String MensajeExito; 
        String MensajeError;
        
        //Iniciamos el Switch
        
        switch (opcion) {
            case 1: // Insertar Registro
                MensajeExito = "El registro del Usuario se ha realizado satisfactoriamente";
                MensajeError = "El registro de Usuario ha fallado";
                if (DUser.agregarRegistro()) {
                  
                    request.setAttribute("mensaje", MensajeExito);
                    
                } else {
                    request.setAttribute("mensaje", MensajeError);
                }
                request.getRequestDispatcher("index2.jsp").forward(request, response);
                break;
                           
            case 2://Consultar registro
                MensajeExito = "El registro se ha consultado correctamente";
                MensajeError = "El registro no se ha podido consultar";
                try {
                    rs = (ResultSet) DUser.consultarRegistro();
                    rs.next();
                    request.setAttribute("US_idd", rs.getString(1));
                    request.setAttribute("Us_td", rs.getString(2));
                    request.setAttribute("US_nom", rs.getString(3));
                    request.setAttribute("US_ape", rs.getString(4));
                    request.setAttribute("US_es", rs.getString(5));
                    request.setAttribute("US_em", rs.getString(6));
                    request.setAttribute("US_rol", rs.getString(7));
                    request.setAttribute("US_esp", rs.getString(8));
                    

                    request.setAttribute("mensaje", MensajeExito);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletUser.class.getName()).log(Level.SEVERE, null, ex);
                    request.setAttribute("mensaje", MensajeError);
                }
               
                request.getRequestDispatcher("index2.jsp").forward(request, response);
                break;
                
            case 3: //Modificar registro
                MensajeExito="El Registro Se Modificó Exitosamente";
                MensajeError="El Registro No Se Modificó Exitosamente";
                   
                if(DUser.actualizarRegistro()){
                request.setAttribute("mensaje", MensajeExito);
                
                }else{
                request.setAttribute("mensaje",MensajeError);
                }
                    request.getRequestDispatcher("index2.jsp").forward(request, response);
               
                break;
                
                
            default:
                request.getRequestDispatcher("index2.jsp").forward(request, response);
                break;
        }// Fin Switch
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
