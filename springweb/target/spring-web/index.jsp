<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
    <form action="${pageContext.request.contextPath}/registerServlet" method="post">
        name:<input type="text" name="name" /><br>
        age:<input type="text" name="age" /><br>
        <input type="submit" value="register">
    </form>
</body>
</html>
