/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.sinensia.modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sinensia.modelo.logica.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Cookie;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ControladorClientes", urlPatterns = {"/clientes.do"})
public class ControladorClientes extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorClientes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorClientes at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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

        String nombre = request.getParameter("nombre");
        nombre=nombre!=null ? nombre : "";
        
        Cookie galleta=new Cookie("nombre_busqueda",nombre);
        galleta.setMaxAge(10000);
        response.addCookie(galleta);
        
        
        
        ServicioClientes srvCli = new ServicioClientes();
        List<Cliente> listado = srvCli.obtenerTodos();
        List<Cliente> listaPorNombre = new ArrayList<>();
        for (Cliente cliente : listado) {
            if (cliente.getNombre().contains(nombre.toLowerCase())) {
                listaPorNombre.add(cliente);
            }
                       
        }
    //BEAN: objeto transmitible a traves de toda la aplicacion, en este caso, ambito
    //de sesion
    //Coger la listapornombre y adjuntarla a la peticion para que cuando redirijamos
    //a la vista de listado_jstl
    request.getSession().setAttribute("listaPorNombre", listaPorNombre);
    request.getRequestDispatcher("listado_jstl.jsp")
            .forward(request, response);
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

        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String edad = request.getParameter("edad");
        String activo = request.getParameter("activo");

        ServicioClientes servCli;
        servCli = new ServicioClientes();
        //Metemos los parámetros recogidos en un servicio
        Cliente cli = servCli.insertar(nombre, email, password, edad, activo);
        //Redireccionamos a la vista de error de registro o de registro ok
        if (cli == null) {
            request.getRequestDispatcher("error_resgistro.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("registro_ok.jsp").forward(request, response);
        }
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
