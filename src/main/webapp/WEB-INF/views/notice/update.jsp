<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<div class="container-fluid my-5">
	<div class="row mb-4 ">
		<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">Notice Update Page</h1>
	</div>
	<form action="./update" method="post">
		 <div class="row col-md-4 mx-auto my-5">
			<input type="hidden" name="noNum" value="${dto.noNum }">
				<div class="fw-bold fs-5 col-12">
		            <p>제목</p>
		            <input type="text" name = "noHead" value="${dto.noHead}" >
	        	 </div>
	        	 <div class="fw-bold fs-5 col-12">
		            <p>내용</p>
		            <textarea name="noBody" rows="" cols="">${dto.noBody}</textarea>
	        	 </div>
			
			 <div class="row justify-content-center my-5">
	            <button type="submit" class="btn btn-primary col-2">수정</button>
	         </div>
		</div>
	</form>
</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>