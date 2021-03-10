<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
Main Page
</h1>
<h6>Vue에서 받은 데이터 : <%= request.getAttribute("month") %></h6>
<h3>Vue로 보낼 데이터 : <%= request.getAttribute("list") %></h3>
</body>
</html>