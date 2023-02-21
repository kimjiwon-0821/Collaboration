<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<div class="container-fluid my-5">
   <div class="row mb-4 ">
		<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">Notice Detail Page</h1>
	</div>
	<div class="row col-md-4 mx-auto my-5">
		<c:if test="${not empty dto  }">
		<h3>Title : ${requestScope.dto.noHead }</h3>
		<h3>User : ${requestScope.dto.noUser}</h3>
		<h3>Date : ${requestScope.dto.noDate}</h3>
		<h3>watch : ${requestScope.dto.noWatch}</h3>
		<h3>Body : ${requestScope.dto.noBody}</h3>
		<div>
			<c:if test="${not empty dto.noticeImgDTO}">
			<img src="../resources/upload/notice/${dto.noticeImgDTO.fileName}"style="width:60%; height:auto;">
			</c:if>
		</div>
		
		<button type="button" class="btn btn-primary mx-auto col-3"onclick="location.href='./delete?noNum=${dto.noNum }'">게시물삭제</button>
		<%-- <a href="./delete?noNum=${dto.noNum }">게시물삭제</a> --%>
		</c:if>
		<c:if test="${empty dto}">해당 게시물이 존재하지 않습니다.</c:if>
		<button type="button" class="btn btn-primary mx-auto col-3"onclick="location.href='./update?noNum=${dto.noNum }'">게시물수정</button>
		<%-- <a href="./update?noNum=${dto.noNum }">게시물 수정</a> --%>
		
		<button type="button" class="btn btn-primary mx-auto col-3"onclick="location.href='./list'">목록으로</button>
		<!-- <a href="./list">목록으로</a> -->
		
	</div>
</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>