<%-- 
    Document   : modificar
    Created on : 28/11/2021, 23:01:33
    Author     : Soledad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center">Modificar Datos del Paciente</h1>
        
        <div class="container">
            
            <div class="row d-flex justify-content-center">
                
                <form class="p-5 w-50" action="PacientesController?accion=actualizar" method="POST">
                    <div class="mb-3">
                        <label for="id" class="form-label"></label>
                        <input type="hidden" class="form-control" id="id" name="id" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input type="text" class="form-control" id="nombre" name="nombre" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="apellido" class="form-label">Apellido</label>
                        <input type="text" class="form-control" id="apellido" name="apellido" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="edad" class="form-label">Edad</label>
                        <input type="text" class="form-control" id="edad" name="edad" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="provincia" class="form-label">Provincia</label>
                        <input type="text" class="form-control" id="provincia" name="provincia" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email" value=""/>
                    </div>
                    <div class="mb-3">
                        <label for="telefono" class="form-label">Teléfono</label>
                        <input type="text" class="form-control" id="telefono" name="telefono" value=""/>
                    </div>
                    <button type="submit" class="btn btn-primary">Agregar</button>

                </form>
            </div>
        </div>
    </body>
</html>
