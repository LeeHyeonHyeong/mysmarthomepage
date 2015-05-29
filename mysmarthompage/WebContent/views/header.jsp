<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>header</title>
</head>
<body>
	<div>
		<div style="margin: 0 auto;">
			<h3>헤더입니다.</h3>
		</div>
			
			<div style="float: right;margin: 100px;">
				<span>
					<a href="${pageContext.request.contextPath}/member/login_form.do">로그인</a>	
				</span>
				<span>
					<a href="${pageContext.request.contextPath}/member/logout.do">로그아웃</a>	
				</span>
				<span>
					<a href="${pageContext.request.contextPath}/member/mypage.do">마이페이지</a>	
				</span>
				<span>
					<a href="${pageContext.request.contextPath}/member/list.do">회원목록</a>
				</span>
						
			</div>
	</div>
	
</body>
</html>
