<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Save request</title>
</head>
<body>
<form action="save-request" method="post">
    Имя: <input name="name" />
    <br><br>
    Возраст: <input name="age" type="number" min="1">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>>