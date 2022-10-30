<%--Separate your concerns--%>

<%--Move any logic you did on the login page to live inside of a servlet instead.--%>

<%--Build an index page for all of your ads--%>

<%--Create a directory inside webapp named ads.--%>
<%--Create a file ads/index.jsp. This file will show a listing of all the ads on your site.--%>
<%--This page should be available when a user visits /ads.--%>
<%--Use the all method on the ListAdsDao class to get a listing of all the ads, and pass this on to your JSP file.--%>
<%--In your JSP file, loop through all the ads and display each one.--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
    </div>
</body>
</html>
