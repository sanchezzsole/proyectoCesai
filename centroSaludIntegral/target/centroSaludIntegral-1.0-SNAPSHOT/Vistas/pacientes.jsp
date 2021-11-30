<%-- 
    Document   : pacientes
    Created on : 28/11/2021, 23:00:45
    Author     : Soledad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Pacientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1>Lista de Pacientes</h1>
        <div class="container">
            <div class="row">
                <a class="btn btn-primary w-25 m-3" href="PacientesController?accion=nuevo">Agregar Paciente</a>
                <table class="table table-primary">
                    <thead>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Edad</th>
                        <th>Provincia</th>
                        <th>Email</th>
                        <th>Teléfono</th>
                        <th>Modificar</th>
                        <th>Eliminar</th>
                    </thead>
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
