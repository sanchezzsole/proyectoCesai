<%-- 
    Document   : modificar
    Created on : 28/11/2021, 23:01:33
    Author     : Soledad
--%>

<%@page import="modelo.PacientesDAO"%>
<%@page import="modelo.Pacientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar datos del Paciente</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            int mid;
            mid = Integer.parseInt(id);
            Pacientes resultado = null;
            PacientesDAO paciente = new PacientesDAO();
            resultado = paciente.mostrarPaciente(mid);
            
        %>
        <h1 class="text-center">Modificar Datos del Paciente</h1>
        
        <div class="container">
            
            <div class="row d-flex justify-content-center">
                
                <form class="p-5 w-50" action="PacientesController?accion=actualizar" method="POST">
                    <div class="mb-3">
                        <label for="id" class="form-label"></label>
                           <input  type="hidden" class="form-control" id="id" name="id" value="<%= resultado.getId()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="nombres" class="form-label">Nombres</label>
                        <input type="text" class="form-control" id="nombres" name="nombres" value="<%= resultado.getNombres()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="apellidos" class="form-label">Apellidos</label>
                        <input type="text" class="form-control" id="apellidos" name="apellidos" value="<%= resultado.getApellidos()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="edad" class="form-label">Edad</label>
                        <input type="text" class="form-control" id="edad" name="edad" value="<%= resultado.getEdad()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="provincia" class="form-label">Provincia</label>
                        <input type="text" class="form-control" id="provincia" name="provincia" value="<%= resultado.getProvincia()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email" value="<%= resultado.getEmail()%>" />
                    </div>
                    <div class="mb-3">
                        <label for="telefono" class="form-label">Teléfono</label>
                        <input type="text" class="form-control" id="telefono" name="telefono" value="<%= resultado.getTelefono()%>" />
                    </div>
                    <button type="submit" class="btn btn-primary">Agregar</button>

                </form>
            </div>
        </div>
    </body>
</html>
