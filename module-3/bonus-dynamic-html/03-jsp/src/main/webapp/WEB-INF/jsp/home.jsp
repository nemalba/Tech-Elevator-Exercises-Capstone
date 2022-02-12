
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="The Solar System" />
</c:import>

<table class="table table-hover table-striped">
	<tr><th>Order</th><th>Title</th></tr>

	<c:forEach items="${movies}" var="movie">
	<tr><td>${movie.order}</td><td>${movie.title}</td></tr>
	</c:forEach>
</table>

<c:import url="/WEB-INF/jsp/footer.jsp" />
