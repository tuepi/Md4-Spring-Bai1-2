<%--
  Created by IntelliJ IDEA.
  User: hongh
  Date: 13/06/2022
  Time: 4:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <button name="opera" value="+">Addition(+)</button>
    <button name="opera" value="-">Subtraction(-)</button>
    <button name="opera" value="*">Multiplication(*)</button>
    <button name="opera" value="/">Division(/)</button>
</form>
<h2>Result : ${result}</h2>
</body>
</html>
