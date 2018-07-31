<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>Filtered devices</title>
</head>
<body>

<table class="table table-hover ">
    <th>Image</th>
    <th>Device type</th>
    <th>Manufacturer</th>
    <th>Energy consuming</th>
    <th>Energy consuming now</th>
    <c:out value="${errorMessage}"></c:out>
    <c:forEach items="${matchedDevices}" var="item" varStatus="status">
        <div class="container">
            <tr>
                <td><img src="${item.imgUrl}"></td>
                <td>${item.type}</td>
                <td>${item.manufacturer}</td>
                <td>${item.energyConsuming}</td>
                <c:choose>
                    <c:when test="${item.turnedOn}">
                        <td>${item.energyConsuming}</td>
                    </c:when>
                    <c:otherwise>
                        <td>0</td>
                    </c:otherwise>
                </c:choose>
            </tr>
        </div>
    </c:forEach>
</table>
<a href="/house" class="btn btn-primary btn-lg btn-block active" role="button" aria-pressed="true">Back to house</a>
</body>
</html>
