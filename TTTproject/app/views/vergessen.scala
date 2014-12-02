@(title: String)(content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password/Username vergessen?</title>
<link href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
</head>
<body>
<form>
<p>E-Mail adresse eingeben: <input type="email" name="Name" placeholder="name@web.de"> </p>
<p> <input type="submit" name="EmailRecovery"> </p>

</form>
</body>
</html>