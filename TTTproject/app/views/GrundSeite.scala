@(title: String) (content: Html)

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Let's Play Tic Tac Toe!</title>
<link href="@routes.Assets.at("bootstrap/dist/css/bootstrap.min.css")" rel="stylesheet">
<script type="text/javascript">
</script>
</head>
<body>
<header>
<!-- Logo -->
<nav class="navbar navbar-inverse" role="navigation">
<div class="container">
<!-- Navigation -->
<!-- Brand and toggle get grouped for better mobile display -->
<div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
<span class="sr-only">Toggle navigation</span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
</div>
<ul class="nav nav-tabs" role="navigation">
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