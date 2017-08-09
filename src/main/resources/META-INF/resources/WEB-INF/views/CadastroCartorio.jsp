<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>

<meta charset="UTF-8" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width" />

<title>Cartório</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/css/style.css"/>">

</head>

<body>
	<header>
		<nav class="navbar navbar-inverse navbar-static-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="http://cartorios.com.vc/"> <img
						alt="Cartórios com você" />
					</a>
				</div>
			</div>
		</nav>
	</header>

	<section>

		<form:form class="form-horizontal" method="POST"
			action="/cartorios/save" modelAttribute="cartorio">

			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="clearfix">
						<h1 class="panel-title ni-titulo-panel">Novo Cartório</h1>

						<a class="btn btn-link ni-link-panel"
							href="<c:url value="/cartorios"/>">Voltar para pesquisa</a>
					</div>
				</div>

				<div class="panel-body">

					<div class="form-group">
						<label for="id" class="col-sm-2 control-label">ID</label>
						<div class="col-sm-1">
							<form:input path="id" type="text" class="form-control" id="id"
								value="${cartorio.id}" readonly="true" />
						</div>
					</div>

					<div class="form-group">
						<label for="descricao" class="col-sm-2 control-label">Descrição</label>
						<div class="col-sm-6">
							<form:input path="descricao" type="text" class="form-control"
								id="descricao" value="${cartorio.descricao}" maxlength="250" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-primary">Salvar</button>
						</div>
					</div>
				</div>
			</div>
		</form:form>

	</section>

	<script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
	<script src="<c:url value="/js/bootstrap.min.js"/>"></script>

	<script>
		$(document).ready(function() {
			document.getElementById("descricao").focus();
		});
	</script>
</body>

</html>