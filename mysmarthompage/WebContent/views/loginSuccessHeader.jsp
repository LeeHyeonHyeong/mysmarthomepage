<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>로그인 성공시 해더</title>
</head>
<body>
	<div style="float: right; margin: 100px;">

		<span> <a
			href="${pageContext.request.contextPath}/member/logout.do">로그아웃</a>
		</span> <span> <a
			href="${pageContext.request.contextPath}/member/mypage.do">마이페이지</a>
		</span> <span> <a
			href="${pageContext.request.contextPath}/member/list.do">회원목록</a>
		</span>

	</div>
</body>
</html>