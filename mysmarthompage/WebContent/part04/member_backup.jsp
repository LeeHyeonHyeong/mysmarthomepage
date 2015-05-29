<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.sql.Connection" %>
<%@ page import="net.syntax.part04.MemberDAO" %>
<%@ page import="net.syntax.part04.MemberBean" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JDBC TEST</title>
</head>
<body>
	<%-- <%
		MemberVo member = new MemberVo();
	%> --%>
	<jsp:useBean class="net.syntax.part04.MemberBean" id="member" scope="page"></jsp:useBean>
	
	이 름 : <%=member.getName() %>
	아이디: <%=member.getId() %>
	비 번 : <%=member.getPwd() %>
	나 이 : <%=member.getAge() %>
	성 별 : <%=member.getGender() %>
</body>
</html>