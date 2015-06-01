<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<!-- 위 4가지 import 는 DB 내용 출력시 반드시 필요하다. -->
<%@ page import="com.mysmarthomepage.join.MemberDAO" %>
<%@ page import="com.mysmarthomepage.join.MemberBean" %>
<%!  /* 선언부는 첫 방문자에 의해 단 한번만 수행됩니다. */
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	HttpSession session = null;
	
	String driver = "jdbc:oracle:thin:@localhost:1521/xe";
	String userId = "system";
	String password = "oracle";
	String sql = "select * from member";
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>마이 페이지</title>
</head>
<body>
	마이 페이지 입니다.
	<div>
		<label for="myInfo">내 정보</label>
		<table style="border: 1px solid blue;width: 100%;height: 300px;background-color: yellow;
	 border-collapse: collapse;" >
		<tr class="row" style="border: 1px solid blue;height: 20%;">
			<th>이름</th>
			<th>아이디</th>
			<th>나이</th>
			<th>성별</th>
		</tr>
		<tr>
		<!-- JSTl문법 -->
		<!-- ${name}을 EL(Expression Langge) 이라고 하면
		이렇게 효현하기 위해서는 JSTL.JAR와 STANDARD.JAR가 필요하다. 2008꺼는 받지말자. 되도록이면 가장최근꺼 받자. -->
			<td>${name}</td>
			<td>아이디</td>
			<td>나이</td>
			<td>성별</td>
		</tr>
	
	</table>
	</div>
	<div>
		<label for="updatePwd">내 정보 변경</label>
		<form action="${pageContext.request.contextPath}/member/updatePwd.do">		
			<label for="pwd">수정할 비밀번호 : </label>
			<input type="password" id="pwd" name="pwd" />
			<input type="submit" value="전 송"/>
		</form>
	</div>
	<div>
		<label for="updatePwd">내 정보 변경</label>
		<form action="${pageContext.request.contextPath}/member/updateInfo.do">		
		
			<label for="name">이름 : </label>
			<input type="text" id="name" name="name" />
			<label for="age">나이 : </label>
			<input type="text" id="age" name="age" />
			<input type="submit" value="전 송"/>
		</form>
	<div>	
			<a href="${pageContext.request.contextPath}/member/remove.do">회원탈퇴</a>
	</div>
	</div>
	
</body>
</html>