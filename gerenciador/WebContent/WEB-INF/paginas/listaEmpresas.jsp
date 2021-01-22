<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Empresas Localizadas</h1>

<c:if test="${not empty nomeEmpresa}">
	<h1>Última cadastrada: ${nomeEmpresa}</h1>
</c:if>

<c:if test="empty novaEmprea">
	<h1>Nenhuma nova empresa</h1>
</c:if>



<ul>
<c:forEach var="empresa" items="${empresas}">
<li>${empresa.id} - ${empresa.nome} - ${empresa.endereco}</li>
</c:forEach>
</ul>
</body>
</html>