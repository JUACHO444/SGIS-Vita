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
 * Servlet implementation class ServletUsuarioPedir
 */
@WebServlet("/ServletUsuarioPedir")
public class ServletUsuarioPedir extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuarioPedir() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        UsuarioController paciente = new UsuarioController();
        String username_paciente = request.getParameter("username_paciente");

        String usuarioStr = paciente.pedir(username_paciente);
        PrintWriter out = response.getWriter();
        out.println(usuarioStr);
        System.out.println("Hola"+usuarioStr);
        out.flush();
        out.close();
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
