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
		<div class="panel panel-default">
			<div class="panel-heading">
				<div class="clearfix">
					<h1 class="panel-title ni-titulo-panel">Pesquisa de Cartórios</h1>
					<a class="btn btn-link ni-link-panel"
						href="<c:url value="/cartorios/add"/>">Novo Cartório</a>
				</div>
			</div>

			<div class="table-responsive">
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th class="text-center col-md-1">#</th>
							<th>Descrição</th>
							<th class="col-md-1"></th>
						</tr>
					</thead>


					<tbody>
						<c:forEach items="${cartorios}" var="item">
							<tr>
								<td class="text-center">${item.id}</td>
								<td>${item.descricao}</td>

								<td class="text-center"><a class="btn btn-link btn-xs"
									href="<c:url value="/cartorios/"/><c:out value="${item.id}"/>"
									title="Editar" rel="tooltip" data-placement="top"> <span
										class="glyphicon glyphicon-pencil"></span>

								</a> <a class="btn btn-link btn-xs" data-toggle="modal"
									data-target="#confirmacaoExclusaoModal"
									data-id="${item.id}" data-descricao="${item.descricao}"
									title="Excluir" rel="tooltip" data-placement="top"> <span
										class="glyphicon glyphicon-remove"></span>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>
			</div>
		</div>
	</section>




	<div>
		<div class="modal fade" id="confirmacaoExclusaoModal" tabindex="-1"
			data-keyboard="false" data-backdrop="static">
			<div class="modal-dialog">

				<form data-url-base="/cartorios" action="/cartorios"
					method="POST">

					<input type="hidden" name="_method" value="DELETE" />

					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Você tem certeza?</h4>
						</div>

						<div class="modal-body">
							<span>Tem certeza que deseja apagar o Cartório ?</span>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Excluir</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	

	<script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
	<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/js/cartorio.js"/>"></script>
</body>

</html>