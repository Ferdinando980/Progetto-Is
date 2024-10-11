<%@ page import="com.justInTime.model.Player" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Just in time - Area admin</title>
    <link href="${pageContext.request.contextPath}/css/header.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/admin.css" rel="stylesheet">
</head>
<body>

<div class="header" id="header">
    <div class="header-main-info" id="header-main-info">
       <!-- <a title=""  href="${pageContext.request.contextPath}/admin" class="logo-image" id="header-logo-image">
            <img src="${pageContext.request.contextPath}/assets/images/logo.png">
        </a>-->
        <h1 class="site-name" id="header-site-name">
            Just in time
        </h1>
    </div>
    <span class="vertical-separator"></span>
    <div class="link-container">
        <a title=""  href="${pageContext.request.contextPath}/logout" class="header-redirect-btn">
            Logout&nbsp;&nbsp;<img src="${pageContext.request.contextPath}/assets/images/log-out.png" alt="">
        </a>
    </div>
</div>

<form action="admin">
    <div class="controls" >
        <select id="table-select" name="table-select">
            <option value="utenza" <%= request.getAttribute("table") != null && request.getAttribute("table").equals("utenza") ? "selected" : "" %>>Utenza</option>
            <option value="partita" <%= request.getAttribute("table") != null && request.getAttribute("table").equals("partita") ? "selected" : "" %>>Partita</option>
        </select>
        <input id="load-table" type="submit" value="Carica dati"/>
    </div>
</form>

<div id="table-container">
    <%
        if (request.getAttribute("table") != null) {
            switch ((String) request.getAttribute("table")) {
                case "utenza":
                    List<Player> utenti = (List<Player>) request.getAttribute("data");
    %>

    <form action="adminSearchFilter">
        <input type="hidden" name="table" value="utenza">
        <div class="filter-container">
            <div class="form-group">
                <label for="emailUtente">Email:</label>
                <input type="text" id="emailUtente" name="emailUtente">
                <label for="nome">Nome:</label>
                <input type="text" id="nome" name="nome">
                <input type="submit" value="Filtra">
            </div>
        </div>
    </form>

    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Cognome</th>
            <th>Genere</th>
            <th>Tipo</th>
            <th>Email</th>
            <th>Username</th>
            <th>Telefono</th>
            <th>Posizione</th>
            <th>Azioni</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Player u : utenti) {
        %>

        <tr>
            <td><%= u.getId() %></td>
            <td><%= u.getName() %></td>
            <td><%= u.getCognome() %></td>
            <td><%= u.getGenere() %></td>
            <td><%= u.getTipo() %></td>
            <td><%= u.getEmail() %></td>
            <td><%= u.getUsername() %></td>
            <td><%= u.getTelefono() %></td>
            <td><%= u.getPosizione() %></td>
            <td>
                <div class="button-container">
                        <form action="adminDelete" method="post" style="display:inline;">
                            <input type="hidden" name="id" value="<%= u.getId() %>">
                            <input type="hidden" name="tipo" value="utenza">
                            <input type="hidden" name="nome" value="null">
                            <input type="submit" value="Elimina">
                        </form>
                        <form action="ModificaServlet" method="post" style="display:inline;">
                            <input type="hidden" name="id" value="<%= u.getId() %>">
                            <input type="hidden" name="tipo" value="utenza">
                            <input type="submit" value="Modifica">
                        </form>
                </div>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <%
            break;}}
    %>
</body>
</html>