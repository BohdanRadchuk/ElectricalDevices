<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="style/style.css">
    <title>House</title>
</head>
<body>

<table class="table table-hover ">
    <form method="post" action="/house">
        <c:forEach items="${HouseDevices}" var="item" varStatus="status">
            <c:out value="${status.index}"/>
            <div class="text-center">
                <tr>
                    <td><img src="images/cook_stove.jpg"></td>
                    <td>${item.manufacturer}</td>
                    <td>${item.turnedOn}</td>
                    <c:choose>
                        <c:when test="${item.turnedOn}">
                            <td>${item.energyConsuming}</td>

                        </c:when>
                        <c:otherwise>
                            <td>0</td>
                        </c:otherwise>
                    </c:choose>

                    <td>
                        <div class="material-switch pull-right">
                            <input id="someSwitchOptionSuccess${status.index}" <c:if
                                    test="${item.turnedOn}"> checked</c:if>
                                   name="someSwitchOption${status.index}" type="checkbox"/>
                            <label for="someSwitchOptionSuccess${status.index}" class="label-success"></label>

                        </div>
                    </td>
                </tr>
            </div>
        </c:forEach>
        <input type="submit">
    </form>
</table>
</body>
</html>
