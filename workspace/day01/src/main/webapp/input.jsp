<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Input Page</h1>
	<form action="/day01/output-jsp" method="get">
	  LoginId: <input type="text" name="loginId">
	  Email: <input type="text" name="email">
	  <button>전송!</button>
	</form>
</body>
</html>