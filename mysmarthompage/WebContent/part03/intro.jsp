<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>서블릿 문법</title>
</head>
<body>
	<div>
		<h3>로그인 폼 샘플(ID와 숫자입력)</h3>
		<div>
			<a href="${pageContext.request.contextPath}/part03/login_form.do">바로가기</a>
		</div>
	</div>
	<div>
		<h3>로그인 폼 2 샘플(ID와 Passward입력)</h3>
		<div>
			<a href="${pageContext.request.contextPath}/part03/login_form2.do">바로가기</a>
		</div>
	</div>
	<div>
		<h3>회원가입 폼 샘플</h3>
		<div>
			<a href="${pageContext.request.contextPath}/part03/join_form.do">바로가기</a>
		</div>
	</div>
	<div>
		<h3>체크박스 폼 샘플</h3>
			<div>
			 	<a href="${pageContext.request.contextPath}/part03/checkbox_form.do">바로가기</a>
			</div>
	</div>
	<div>
		<h3>셀렉트폼 바로가기</h3>
		<div>
			<a href="${pageContext.request.contextPath}/part03/selectbox_form.do">바로가기</a>
		</div>
	</div>
	
</body>
</html>