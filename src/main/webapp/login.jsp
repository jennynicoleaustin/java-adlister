<%--   http://localhost:8080/login.jsp  --%>
<%--    Notice no declaration in terms of what the page destination needed to be, the page url was generated based on the server and then the file name. Is this because it is inside the pom.xml page? --%>

<%-- todo When a user visits /login.jsp, they should see a form for logging in--%>
<%-- todo This form should have a 'username' and 'password' field.--%>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%--You can move this to a seperate html file... --%>
<!doctype html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<p>Thanks for logging in
</p>
<form action="/profile.jsp" method="post">
    <label for="username">Username</label>
    <input id="username" type="text" name="username">
    <label for="password">Password</label>
    <input id ="password" type="text">
    <input type="submit" value="submit">
</form>


</body>
</html>

<%-- todo This form should submit a POST request to /login.jsp--%>

<%-- todo Inside of login.jsp write some code to check the submmitted values. If the username submitted is "admin", and the password is "password", redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<%= request.getParameter("username")%>
<%= request.getParameter("password")%>

<%--We will give our site's login page much more robust functionality in future lessons.--%>