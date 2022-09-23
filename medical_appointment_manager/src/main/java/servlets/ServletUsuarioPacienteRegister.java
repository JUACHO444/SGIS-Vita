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
	 * Servlet implementation class ServletUsuarioRegister
	 */
	@WebServlet("/ServletUsuarioPacienteRegister")
	public class ServletUsuarioPacienteRegister extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public ServletUsuarioPacienteRegister() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			UsuarioController paciente = new UsuarioController();
			
			String username_paciente = request.getParameter("username_paciente");
			String contrasena = request.getParameter("contrasena");
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
                        int edad = Integer.parseInt(request.getParameter("edad"));
                        String genero = request.getParameter("genero");
			String email = request.getParameter("email");
			String regimen = request.getParameter("regimen");
						
			String result = paciente.register(username_paciente, contrasena, nombre, apellido, edad, genero, email, regimen);
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(result);
			out.flush();
			out.close();
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}