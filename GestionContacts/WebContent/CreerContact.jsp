<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer contact</title>
</head>
<body>
<form method="post" action="CreerContact">
<table align="center">
<tr>
<th colspan="2"><h2
align="center">Ajouter un nouveau contact:</h2></th>
</tr>
<tr>
<td align="right"></td><td><label><input type="radio" name="entp" id="c1" value="employe" >Employe</label><br></td>
</tr>
<tr>
<td align="right"></td><td><label><input type="radio" name="entp" id="c2" value="entreprise">Entreprise</label><br></td>
</tr>
<tr align="center">
<td align="right"><label type = "text" value = "Num Siret:">Num Siret:</label> <!-- pour cacher mettre type = hidden et enlever le text"Num siret" -->
</td><td><input type="text" name="numSiret" size="25"></td>
</tr>
<tr align="center">
<td align="right">Nom :
</td><td><input type="text" name="nom" size="25"></td>
</tr>
<tr align="center">
<td align="right">Prénom :
</td><td><input type="text" name="prenom" size="25"></td>
</tr>

<tr align="center">
<td align="right">Email :
</td><td><input type="text" name="email" size="25"></td>
</tr>

 
<tr align="center">
<td align="right">Rue :
</td><td><input type="text" name="rue" size="25"></td>
</tr>


<tr align="center">
<td align="right">Code Postal</td><td><input type="text" name="codePostal" size="25"></td>
</tr>


<tr align="center">
<td align="right">Ville  :
</td><td><input type="text" name="ville" size="25"></td>
</tr>


<tr align="center">
<td align="right">Pays  :
</td><td><input type="text" name="pays" size="25"></td>
</tr>

<tr align="center">
<td align="right">Tel Maison :
</td><td><input type="text" name="telMaison" size="25"></td>
</tr>

<tr align="center">
<td align="right">Tel Mobile :
</td><td><input type="text" name="telMobile" size="25"></td>
</tr>

<tr align="center">
<td align="right">Tel Bureau :
</td><td><input type="text" name="telBureau" size="25"></td>
</tr>

<th colspan="2"><h2
align="center">Ajouter au groupe :</h2></th>
</tr>
<tr>
<td align="right"></td><td><label><input type="checkbox" name="nomGroupe" id="c1" value="amis">Groupe Amis</label><br></td>
</tr>
<tr>
<td align="right"></td><td><label><input type="checkbox" name="nomGroupe" id="c2" value="famille">Groupe Famille</label><br></td>
</tr>

<tr>
<td align="right"></td><td><label><input type="checkbox" name="nomGroupe" id="c3" value="collegue">Groupe Collègues</label><br></td>
</tr>

<tr>
<td align="right"></td><td><input type="checkbox" name="nomGroupe"  id="c4" value="autres"><input type = "text" value="autres" size = "25"><br></td>
</tr>

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