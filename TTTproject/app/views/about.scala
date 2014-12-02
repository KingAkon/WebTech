@(title: String)(content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Über Uns!</title>
<link  href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
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
  <li role="presentation"><a href="instructions.html" role="tab" data-toggle="tab">Instructions</a></li>
  <li role="presentation"class="active"><a href="about.html" role="tab" data-toggle="tab">About</a></li>
</ul>
<h1>Dieses Projekt ist für WebTechnologie!!</h1>
</body>
</html>