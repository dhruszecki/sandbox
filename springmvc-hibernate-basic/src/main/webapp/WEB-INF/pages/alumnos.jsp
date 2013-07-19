<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC Hibrnate Basics</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row">
        <div class="span8 offset2">
            <h1>Alumnos</h1>
            <form:form method="post" action="add" commandName="alumno" class="form-horizontal">
            <div class="control-group">
                <form:label cssClass="control-label" path="nombre">First Name:</form:label>
                <div class="controls">
                    <form:input path="nombre"/>
                </div>
            </div>
            <div class="control-group">
                <form:label cssClass="control-label" path="apellido">Last Name:</form:label>
                <div class="controls">
                    <form:input path="apellido"/>
                </div>
            </div>
            <div class="control-group">
                <form:label cssClass="control-label" path="tipoDocumento">Tipo Documento:</form:label>
                <div class="controls">
                    <form:input path="tipoDocumento"/>
                </div>
            </div>            
            <div class="control-group">
                <form:label cssClass="control-label" path="documento">Documento:</form:label>
                <div class="controls">
                    <form:input path="documento"/>
                </div>
            </div>
			<div class="control-group">
                <form:label cssClass="control-label" path="edad">Edad:</form:label>
                <div class="controls">
                    <form:input path="edad"/>
                </div>
            </div>            
            <div class="control-group">
                <div class="controls">
                    <input type="submit" value="Add Alumno" class="btn"/>
                    </form:form>
                </div>
            </div>

            <c:if test="${!empty alumnos}">
                <h3>Alumnos</h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${alumnos}" var="alumno">
                        <tr>
                            <td>${alumno.apellido}, ${alumno.nombre}</td>                            
                            <td>${alumno.tipoDocumento}</td>
                            <td>${alumno.documento}</td>
                            <td>${alumno.edad}</td>
                            <td>
                                <form action="delete/${alumno.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>

</body>
</html>