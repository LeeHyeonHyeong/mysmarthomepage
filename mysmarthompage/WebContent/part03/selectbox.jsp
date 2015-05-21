<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Selectbox 폼</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/part03/selectbox.do">
		<span> <label for="jod">직업</label> <select name="job" id="job"size="1">
				<option value="">선택하세요</option>
				<option value="학생">학생</option>
				<option value="IT개발자">IT개발자</option>
				<option value="언론인">언론인</option>
				<option value="군인">군인</option>
				<option value="기타">기타</option>
				<!-- 관심분야를 물어보는 콤보박스-->
		</select>
		</span> <span> <label for="interest" style="float: left">관심분야</label>
			<select name="interest" id="interest" size="5" multiple="multiple">
				<option value="">선택하세요</option>
				<option value="아카기">아카기</option>
				<option value="요크타운">요크타운</option>
				<option value="아크로열">아크로열</option>
				<option value="크라프 체펄린">크라프 체펄린</option>
				<option value="기타">기타</option>

			</select>
		</span>
		<input type="submit" value="전 송" style="float;margin-right:50px" />
	</form>
</body>
</html>