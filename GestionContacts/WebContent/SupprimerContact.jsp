<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supprimer Contact</title>
</head>
<body>
<form method="post" action="SupprimerContact">
	<table align="center">
<tr>
<th colspan="2"><h2
align="center">Supprimer un contact: </h2></th>
</tr>
		<tr align="center">
<td align="right">id Contact :
</td><td><input type="text" name="idContact" size="25"></td>
</tr>		<tr>
<tr align="center">
<td align="right"><input class="button"
type="button" value="Back" onClick="history.go(-1);return true;"></td>
<td><input class="button" type="submit" value="Submit"> <input class="button"
type="reset" value="Reset"></td>
			
		</tr>
	</table>
</form>
</body>
</html>