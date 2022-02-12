<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Marvel Timeline</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">


</head>
<body>
<h1>Marvel <span>(on Disney+)</span></h1>

<table class="table table-hover table-striped">
    <tr><th>Order</th><th>Title</th></tr>
    <c:forEach items="${movies}" var="movie">
        <tr><td>${movie.order}</td><td>${movie.title}</td></tr>
    </c:forEach>
</table>


</body>

</html>