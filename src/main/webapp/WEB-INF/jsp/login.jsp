<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>

<form action="<%=request.getContextPath()%>/login" method="get">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="提交">
</form>
</body>
</html>
