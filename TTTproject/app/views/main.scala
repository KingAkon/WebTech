@(title: String) (content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Let's Play Tic Tac Toe!</title>
<link href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
<script type="text/javascript">
function anmelden() {	
	
	alert("Bitte zuerst anmelden! Wenn Sie noch keinen Account haben, bitte registrieren!")
}
</script>
</head>
<body>
<header>
<!-- Nav tabs -->
<ul class="nav nav-tabs" role="tablist">
  <li role="presentation" class="active"><a href="GrundSeite.html" role="tab" data-toggle="tab">Home</a></li>
  <li role="presentation"><a onclick="anmelden()" role="tab" data-toggle="tab">Neues Spiel</a></li>
  <li role="presentation"><a href="options.html" role="tab" data-toggle="tab">Options</a></li>
  <li role="presentation"><a href="instructions.html" role="tab" data-toggle="tab">Instructions</a></li>
  <li role="presentation"><a href="about.html" role="tab" data-toggle="tab">About</a></li>
</ul>



	<form name="login">
		Username <input type="text" name="userid" placeholder="Username" />
		<p>
			Password <input type="password" name="password" />
		</p>
		<p>
		</form>
				<a href="afterLogin.html">
				<button>Login</button>
				</a> 
				<a href="vergessen.html">
				<button>Passwort/Username vergessen?</button>
				</a>
			
				<a href="Registrierung.html">
 				<button>Registrieren?</button>
				</a>
	
	
	
		</body>
		</html>
