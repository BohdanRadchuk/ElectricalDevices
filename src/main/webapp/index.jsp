<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Hello World!</h2>
<h3>
    <c:out value="${message}"/>
</h3>
    <form method="post" action="/hello">
        <h3>Type your message here</h3>
      <input type="text" name="inputMessage"><br>
        <input type="submit" value="doPost">
    </form>
</body>
</html>
