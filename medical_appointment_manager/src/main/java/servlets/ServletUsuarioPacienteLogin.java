/*/*
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
@WebServlet("/ServletUsuarioPacienteLogin")
    

public class ServletUsuarioPacienteLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletUsuarioPacienteLogin() {
    }
        
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsuarioController paciente = new UsuarioController();
        String username_paciente = request.getParameter("username_paciente");
        String contrasena = request.getParameter("contrasena");
        String result = paciente.login(username_paciente, contrasena);
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
