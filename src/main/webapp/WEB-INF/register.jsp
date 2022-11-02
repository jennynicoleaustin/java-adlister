<%--
  Created by IntelliJ IDEA.
  User: jenniferaustin
  Date: 11/2/22
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<form action="/register" method="post">
    <div class="mb-3">
        <label for="username" class="form-label">Username </label>
        <input class="form-control" id="username" name="username" type="username">
    </div>
    <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" class="form-control" id="email" name="registerEmail">
    </div>
    <div class="mb-3">
        <label for="password1" class="form-label">Password</label>
        <input type="password" class="form-control" id="password1" name="registerPassword1">
    </div>    <div class="mb-3">
    <label for="password2" class="form-label">ReEnter your Password</label>
    <input type="password" class="form-control" id="password2" name="registerPassword2">
</div>
    <button type="submit" class="btn btn-primary" name="registerButton">Sign up!</button>
</form>
</body>
</html>
