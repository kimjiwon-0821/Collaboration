<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>
	<h1>Notice Detail Page</h1>
	<c:if test="${not empty dto  }">
	<h3>Num : ${requestScope.dto.noHead }</h3>
	<h3>Title : ${requestScope.dto.noUser}</h3>
	<h3>Detail : ${requestScope.dto.noDate}</h3>
	<h3>Rate : ${requestScope.dto.noWatch}</h3>
	<h3>Sale : ${requestScope.dto.noBody}</h3>
	<div>
		<c:if test="${not empty dto.noticeImgDTO}">
		<img src="../resources/upload/notice/${dto.noticeImgDTO.fileName}">
		</c:if>
	</div>
	
	<a href="./delete?noNum=${dto.noNum }">상품삭제</a>
	</c:if>
	<c:if test="${empty dto}">해당 상품이 존재하지 않습니다.</c:if>
	<a href="./update?noNum=${dto.noNum }">상품 수정</a>
	<a href="./list">목록으로</a>
	
	

</body>
</html>