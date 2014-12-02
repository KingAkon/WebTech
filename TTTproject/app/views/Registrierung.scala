@(title: String)(content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
<title>Registrierung</title>
</head>
<body>
<h1> Registrierung </h1>
<form>

<p> Benutzername: 			<input type="text" name="Name"> </p>
<p> Passwort:				<input type="password" name="Adresse"> </p>
<p> Passwort best�tigen:	<input type="password" name="Name"> </p>



<p> Geschlecht: M�nnlich <input type="radio" value="m" name="sex">
				Weiblich <input type="radio" value="w" name="sex"><p>
<p><input type="button" value="bestaetigen"></p>

</form>


</body>
</html>