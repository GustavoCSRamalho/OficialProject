<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="br.com.project.dao.PlataformaDAO" />

<table>
	<c:forEach var="project" items="${dao.pega}">
			<tr><td>Nome do projeto :</td></tr>
			<tr><td>${project.project}</td></tr>
			<tr><td>Conteuto da introducao :</td></tr>
			<tr><td>${project.introducao}</td></tr>
			<tr><td>Conteudo do desenvolvimento :</td></tr>
			<tr><td>${project.desenvolvimento}</td></tr>
			<tr><td>Conteutos dos erros :</td></tr>
			<tr><td>${project.erros}</td></tr>
	</c:forEach>
</table>