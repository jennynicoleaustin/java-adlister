
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
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
<div class="container fluid">
<form action="/pizza-order.jsp" method="post">
    <div class="crust"> Select your sauce
        <div class="form-check">
            <input class="form-check-input" type="radio" name="crust" id="hand-tossed"
            value="Hand-Tossed">
            <label class="form-check-label" for="hand-tossed">
                Hand Tossed
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="crust" id="thin" value="Thin">
            <label class="form-check-label" for="thin">
                Thin
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="crust" id="deep-dish" value="Deep-Dish">
            <label class="form-check-label" for="deep-dish">
                Deep Dish
            </label>
        </div>
    </div>

    <div class="sauce"> Select your sauce
        <div class="form-check">
            <input class="form-check-input" type="radio" name="sauce" id="traditional">
            <label class="form-check-label" for="traditional">
                Traditional
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="sauce" id="pesto">
            <label class="form-check-label" for="pesto">
                Pesto
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="sauce" id="white-sauce">
            <label class="form-check-label" for="white-sauce">
                Medium
            </label>
        </div>
    </div>

    <div class="size"> Select your size
        <div class="form-check">
            <input class="form-check-input" type="radio" name="size" id="small">
            <label class="form-check-label" for="small">
                Small
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="size" id="medium">
            <label class="form-check-label" for="medium">
                Medium
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="size" id="large">
            <label class="form-check-label" for="large">
                Large
            </label>
        </div>
    </div>

    <div class="address">
        <div class="col-12">
            <label for="inputAddress" class="form-label">Address</label>
            <input type="text" class="form-control" id="inputAddress">
        </div>
        <div class="col-12">
            <label for="inputAddress2" class="form-label">Address 2</label>
            <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
        </div>
        <div class="col-md-6">
            <label for="inputCity" class="form-label">City</label>
            <input type="text" class="form-control" id="inputCity">
        </div>
        <div class="col-md-4">
            <label for="inputState" class="form-label">State</label>
            <select id="inputState" class="form-select">
                <option selected>Choose...</option>
                <option>...</option>
            </select>
        </div>
        <div class="col-md-2">
            <label for="inputZip" class="form-label">Zip</label>
            <input type="text" class="form-control" id="inputZip">
        </div>
    </div>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
</form>
</div>

<div>Thank you for your order!</div>
<div>You selected a ${size} pizza with ${crust} crust with ${sauce} sauce.</div>
</body>
</html>