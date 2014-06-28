<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html; charset=UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Título aqui</title>

<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-responsive.css" rel="stylesheet" />
<link href="css/styles.css" rel="stylesheet" />
<link href="signin.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Cache-Control"
	content="no-cache, no-store, must-revalidate" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<script>
	function focar() {
		document.getElementById("usuario").focus();
	}
</script>
</head>
<body>




	<div class="container">

		<form class="form-signin" role="form" action="j_spring_security_check" method="post">
		<div class="form-group" style="margin-left: 25%">
		<img src="login.png" /> 
		</div>
		<div class="form-group" style="margin-left: 15%">
		<h3>Acesso ao Sistema</h3>
		</div>
			
			<%
				if (request.getParameter("msg") != null) {
					out.print("<span style='color: red;font-weight: bold;'>Usuário ou senha incorretos</span>");
				}
			%>
			<div class="form-group">
				<label for="exampleInputEmail1">Usuário</label> <input type="text"
					id="usuario" name="j_username" class="span3" />
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label> <input
					name="j_password" type="password" class="span3" />
			</div>


			<input class="btn btn-large btn-success btnSignup" type="submit"
				value="Entrar" />
		</form>
		<div class="footer" style="margin-left: 40%">   
		<h5>Desenvolvido por cαrℓσs αυgυsτσ</h5>
		</div>  
	</div>
	<!-- /container -->



</body>
</html>