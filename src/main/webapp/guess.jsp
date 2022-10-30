<%--
A user goes to /guess and is prompted to guess a number between 1 and 3. If correct, the user will be redirected to /correct or /incorrect, depending on if they guess correctly. In either case, the user will see the same view but with an outcome-specific message in a heading (e.g. "You Won!" or "You Lose!").
use a POST request on the form
use two JSPs (one for guessing and another to view the outcome)
use three servlets:
one servlet for sending the guess view and processing the guess
another servlet for serving up the outcome JSP with a win message
another servlet for serving up the outcome JSP with a loss message
Bonus: If a user submits a number other than 1, 2, or 3, redirect them back to the guessing form.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form action="/guess" method="post">
    <label for="guess">Guess a number from 1-3:</label>
    <input type="text" id="guess" name="guess" />
    <input type="submit" value="Submit">
</form>
</body>
</html>
