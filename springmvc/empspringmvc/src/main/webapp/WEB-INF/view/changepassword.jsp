<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<fieldset>
	<a href="./home" style="float: left;">Home</a> <br>
		<a href="./logout" style="float: right;">LogOut</a>
		<legend>Change PassWord</legend>
		<form action="./changepassword" method="post">
			<table>

				<tr>
					<td>New Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="ChangePassword"></td>
				</tr>

			</table>
		</form>

	</fieldset>




</body>
</html>