/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UsuarioController;

/**
 *
 * @author juach
 */
@WebServlet("/ServletUsuarioMedicoLogin")
public class ServletUsuarioMedicoLogin extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ServletUsuarioMedicoLogin() {
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioController medico = new UsuarioController();
        String username_medico = request.getParameter("username_medico");
        String contrasena = request.getParameter("contrasena");
        String result = medico.login_medico(username_medico, contrasena);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   

}
