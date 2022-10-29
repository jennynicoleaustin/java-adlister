<%--@elvariable id="message" type="PizzaOrderServlet"--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Pizza Order</title>
<%@ include file="partials/head.jsp"%>>

</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>Order your pizza!</h1>
<%--A user goes to /pizza-order and sees a pizza order form.
This form features choices to select the
crust type,
sauce type,
size type (use select inputs),
toppings (checkboxes), and
delivery address (text input).
Use System.out.println to output the values submitted by the user.--%>
<h1>${message}</h1>
<div class="container fluid">
    <form action="/pizza-order" method="post">
        <label for="crust">Crust:</label>
        <select name="crust" id="crust">
            <option value="thin">Crispy Thin</option>
            <option value="pan">Pan</option>
            <option value="deep-dish">Deep Dish</option>
        </select>
        <label for="sauce">Sauce:</label>
        <select name="sauce" id="sauce">
            <option value="original">Original Red Sauce</option>
            <option value="pesto">Pesto Sauce</option>
            <option value="alfredo">Alfredo Sauce</option>
        </select>
        <label for="size">Pizza Size:</label>
        <select name="size" id="size">
            <option value="personal">Personal</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni" /> <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="sausage" name="toppings" value="sausage" /> <label for="sausage">Italian Sausage</label>
        <input type="checkbox" id="mushroom" name="toppings" value="mushroom" /> <label for="mushroom">Mushroom</label>
        <br />
        <label for="address">Deliver to:</label>
        <input type="text" id="address" name="address" />
        <input type="submit" value="Submit Order">
    </form>
</div>

<div>Thank you for your order!</div>
</body>
</html>