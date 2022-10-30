<%--This file will show a listing of all the ads on your site.--%>
<%--Use the all method on the ListAdsDao class to get a listing of all the ads, and pass this on to your JSP file.
In your JSP file, loop through all the ads and display each one.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
