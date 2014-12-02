@(title: String)(content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
<script type="text/javascript">
function anmelden() {	
	
	alert("Bitte zuerst anmelden! Wenn Sie noch keinen Account haben, bitte registrieren!")
}
</script>
</head>
<body>

<!-- Nav tabs -->
<ul class="nav nav-tabs" role="tablist">
  <li role="presentation"><a href="GrundSeite.html" role="tab" data-toggle="tab">Home</a></li>
  <li role="presentation"><a onclick="anmelden()" role="tab" data-toggle="tab">Neues Spiel</a></li>
  <li role="presentation"><a href="options.html" role="tab" data-toggle="tab">Options</a></li>
  <li role="presentation" class="active"><a href="instructions.html" role="tab" data-toggle="tab">Instructions</a></li>
  <li role="presentation"><a href="about.html" role="tab" data-toggle="tab">About</a></li>
</ul>
	<h1>Instructions</h1>

	Auf einem quadratischen, 3×3 Felder großen Spielfeld setzen die beiden
	Spieler abwechselnd ihr Zeichen (ein Spieler Kreuze, der andere Kreise)
	in ein freies Feld. Der Spieler, der als Erster drei Zeichen in eine
	Zeile, Spalte oder Diagonale setzen kann, gewinnt. Wenn allerdings
	beide Spieler optimal spielen, kann keiner gewinnen, und es kommt zu
	einem Unentschieden. Das heißt, alle neun Felder sind gefüllt, ohne
	dass ein Spieler die erforderlichen Zeichen in einer Reihe, Spalte oder
	Diagonalen setzen konnte.
</body>
</html>