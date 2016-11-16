<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier contact</title>
</head>
<body>
	<form method="post" action="ModifierContact">

		<table align="center">
			<tr>
				<th colspan="2"><h2 align="center">Modifier un contact:</h2></th>
			</tr>
			<tr align="center">
				<td align="right">id Contact :</td>
				<td><input type="text" name="idContact" size="25"></td>
		</tr>
			<tr align="center">
				<td align="right">Nom :</td>
				<td><input type="text" name="nom" size="25"></td>
			</tr>
			<tr align="center">
				<td align="right">Prénom :</td>
				<td><input type="text" name="prenom" size="25"></td>
			</tr>
			<tr align="center">
				<td align="right">Email :</td>
				<td><input type="text" name="email" size="25"></td>
			</tr>
			<tr>
			<tr align="center">
				<td align="right"><input class="button" type="button"
					value="Back" onClick="history.go(-1);return true;"></td>
				<td><input class="button" type="submit" value="Submit">
					<input class="button" type="reset" value="Reset"></td>
		</table>
	</form>

</body>
</html>