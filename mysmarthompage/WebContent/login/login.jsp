<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function move() {
		location.herf = "main.jsp";
	}
	function popup() {
		window.open('info.jsp')
	}
	function login() {
		location.herf = "login.jsp";
	}
	function move() {
		location.herf = "mypage.jsp";
	}
</script>
</head>
<body>
	<div style="width: 100%" align="center">
		<h1>로그인</h1>
		<img src="../images/logo.png" alt="" />
		<div>
			<p><h4>ITBANK</h4></p>
			<h5>MULTICAMPUS</h5>에 오신걸 환영합니다.
		</div>
		<div style="margin-top: 20px">
			<input type="text" placeholder="아이디를 입력해주세요"/><br />
			<input type="text" placeholder="비밀번호를 입력해주세요"/>
		</div>
		<div>
			<p>최초 비밀번호는 회원님의 생년월일 6자리(YYMMDD)로 설정되어 있습니다.</p>
			로그인후 비밀번호를 반드시 변경 해주세요. <font color="red">단, 직원은 제외</font>
		</div>
		<div style="margin-top: 20px">
			<img src="../images/btn_login.gif" alt=""  onclick="javascript : login()" />
		</div>
		<div> <a href="#" onclick="javascript:move()">
		아이디 찾기</a> | <a href="">비밀번호 찾기</a></div>
		
		<div>
		<button onclick="../mypage()">홈</button>
		</div>
	</div>
</body>
</html>





