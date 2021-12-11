
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.PacientesDAO;
import modelo.Pacientes;



@WebServlet(name = "PacientesController", urlPatterns = {"/PacientesController"})
public class PacientesController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PacientesDAO pacientesDao = new PacientesDAO();
            String accion;
            RequestDispatcher dispatcher = null;
            accion = request.getParameter("accion");
            if (accion == null || accion.isEmpty()) {
                dispatcher = request.getRequestDispatcher("Vistas/pacientes.jsp");        
            } else if(accion.equals("modificar")){
                dispatcher = request.getRequestDispatcher("Vistas/modificar.jsp");
            } else if(accion.equals("actualizar")){
                int id = Integer.parseInt(request.getParameter("id"));
                String nombres = request.getParameter("nombres");
                String apellidos = request.getParameter("apellidos");
                String edad = request.getParameter("edad");
                int ed = Integer.parseInt(edad);
                String provincia = request.getParameter("provincia");
                String email = request.getParameter("email");
                String telefono = request.getParameter("telefono");
                int tl = Integer.parseInt(telefono);
                Pacientes paciente = new Pacientes(id, nombres, apellidos, ed, provincia, email, tl);
                pacientesDao.actualizarPaciente(paciente);
                dispatcher = request.getRequestDispatcher("Vistas/pacientes.jsp");
            }
            dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
