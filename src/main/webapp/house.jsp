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
    <form method="post" action="/sorthouse">
        <input class="btn btn-info btn-lg btn-block" type="submit" value="Sort">
    </form>
    <form method="post" action="/house">
        <c:forEach items="${HouseDevices}" var="item" varStatus="status">
          <%--  <c:out value="${status.index}"/>--%>
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

                    <td>
                        <div class="material-switch pull-right">
                            <input id="switchOptionSuccess${status.index}" <c:if test="${item.turnedOn}">
                                checked
                            </c:if>
                                   name="switchOption${status.index}" type="checkbox"/>
                            <label for="switchOptionSuccess${status.index}" class="label-success"></label>

                        </div>
                    </td>
                </tr>
            </div>
        </c:forEach>
        <input class="btn btn-warning btn-lg btn-block" type="submit" value="Power">
    </form>

</table>
<div>
    <h3 class="text-center">Total energy consuming at the moment: ${totalEnergy} </h3>
</div>
</body>
</html>
