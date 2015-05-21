<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 권한 허용 샘플</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/part03/login_demo2.jsp">
		<label for="userid">아이디 : </label>
		<input type="text" name="id"  id="id"/></br>
		<label for="passward">암호</label>
		<input type="passward" name="pwd" id="pwd" /></br>
		<input type="submit" value="로그인" />
	</form>
	
	
</body>
</html>