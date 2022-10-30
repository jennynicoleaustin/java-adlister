
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form action="/view-color/${color}">
<label for="color">Enter your favorite color:</label>
<input type="text" id="color" name="color" />
<input type="submit" value="Submit">
</form>
</body>
</html>
