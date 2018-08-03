<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<style type="text/css">
	
	.teste{
		margin-top:10%;
		margin-right:10%;
		margin-left:10%;
		text-align: center
	}
	</style>
	
	<form action="/enviar" method="post">
	
	<fieldset class="teste">
		<legend> Pagina de contato </legend>
		
			<div>
				<label> NOME : </label>
					<input type="text" name="tNome" id="tIdNome" placeholder="Digite o seu nome">
				</div>
				
					<div>
						<label> E-mail : </label>
							<input type="text" name="tEmail" id="tIdEmail" placeholder="Digite o seu email">
					</div>
					
						<div>
							<label> Telefone : </label>
								<input type="text" name="tTelefone" id="tIdTelefone" placeholder="Digite o seu telefone">
						</div>
						
						<br>
						
						<input type="submit" value="Enviar">
		
	</fieldset>
	
	
	</form>
</body>
</html>