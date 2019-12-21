<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./logout" style="float: right;">LogOut</a>
<a href="./home" style="float: left;">Home</a>
<h2 align="center" style="color: blue;">UpdateProfile</h2>
		

<fieldset>
		<legend>UpdateProfile</legend>
		
		<form action="./updateprofile" method="post">

			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>



				<tr>
					<td>DOJ</td>
					<td><input type="date" name="doj"></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td>
					<select name="gender" required="required">
						<option>--------select---------</option>
						<option value="M">Male</option>
						<option value="F">FeMale</option>
						<option value="O">Others</option>


					</select>
					
					
					</td>
				</tr>

				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="Register"></td>
				</tr>

			</table>

		</form>
	</fieldset>

</body>
</html>