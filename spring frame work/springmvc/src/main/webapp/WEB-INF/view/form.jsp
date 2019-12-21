<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./form" method="post">

<table border="1">
<tr>
<td>Id:</td>
<td><input type="number" placeholder="Enter id" name="id"/></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name" placeholder="Enter Name here.."/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="pwd" placeholder="Enter password"/></td>
</tr>
<tr>
<td>Date:</td>
<td><input type="date" name="doj" placeholder="Enter joing date"/></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" placeholder="Enter id" name="gen" value="Male"/>M</td>
<td><input type="radio" placeholder="Enter id" name="gen" value="Female"/>F</td>
</tr>
<tr><td><input type="submit" value="Register"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>

</table>
</form>

</body>
</html>