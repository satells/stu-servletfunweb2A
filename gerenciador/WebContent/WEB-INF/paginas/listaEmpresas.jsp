<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Empresas Localizadas</h1>
<h1>Última cadastrada: ${nomeEmpresa}</h1>
<ul>
<c:forEach var="empresa" items="${empresasx}">
<li>${empresa.id} - ${empresa.nome} - ${empresa.endereco}</li>
</c:forEach>
</ul>
</body>
</html>