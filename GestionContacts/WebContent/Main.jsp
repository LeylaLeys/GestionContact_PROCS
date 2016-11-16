<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
</head>
<body>
	<ul>
		<li><a href="CreerContact.jsp">Créer Contact</a></li>
		<li><a href="ModifierContact.jsp">Modifier Contact</a></li>
		<li><a href="SupprimerContact.jsp">Supprimer Contact</a></li>
		<li><a href="RechercherContact.jsp">Rechercher Contact</a></li>
		<li><a href="Hello.jsp">Tester Spring</a></li>
	</ul>
	<center>
		<table align="center" >
			<tr>
				<td>Nom</td>
				<td>Prenom</td>
				<td>Email</td>
				<td>Adresse</td>
				<td>Tel Mobile</td>
				<td>Tel Maison</td>
				<td>Tel Bureau</td>
				<td>Groupe</td>
			</tr>
			<tr>
				<td>$contact.nom</td>
				<td>$contact.prenom</td>
				<td>$contact.email</td>
				<td>$contact.adresse</td>
				<td>Tel </td>
				<td>Tel </td>
				<td>Tel </td>
				<td>groupes</td>
				<td><a href="ModifierContact.jsp">Modifier</td>
				<td><a href="RechercherContact.jsp">Supprimer</td>
			</tr>
		</table>
	</center>
</body>
</html>