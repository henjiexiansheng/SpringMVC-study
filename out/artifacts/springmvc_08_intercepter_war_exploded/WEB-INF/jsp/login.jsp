<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <span>用户名:</span><input type="text" name="username">
    <span>密码:</span><input type="password" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
