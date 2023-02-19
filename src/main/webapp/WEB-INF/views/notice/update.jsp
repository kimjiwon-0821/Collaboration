<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Page</h1>
	<form action="./update" method="post">
		<input type="hidden" name="noNum" value="${dto.noNum }">
	<fieldset>
		<legend>제목</legend>
		<input type="text" name = "noHead" value="${dto.noHead}" ><br>
	</fieldset>
	<fieldset>
		<legend>내용</legend>
		<textarea name="noBody" rows="" cols="">${dto.noBody}</textarea><br>
	</fieldset>
		<button type="submit">수정</button>
	</form>

</body>