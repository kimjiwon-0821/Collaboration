<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 추가</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<div class="container-fluid my-5">
   <div class="row mb-4 ">
		<h1 class="col-md-7 mx-auto text-center border-bottom border-dark pb-4">Notice Add Page</h1>
	</div>
   <form action="./add" method = "post" enctype="multipart/form-data">
      <div class="row col-md-4 mx-auto my-5">
         <div class="fw-bold fs-5 col-12">
            <p>글쓴이</p>
            <input type="text" name="noUser" class="form-control" id="exampleFormControlInput1" placeholder="글쓴이 입력"><br>
         </div>
         <div class="fw-bold fs-5 col-12">
            <p>제목</p>
            <input type="text" name="noHead" class="form-control" id="exampleFormControlInput1" placeholder="제목 입력"><br>
         </div> 
         <div class="fw-bold fs-5 col-12">
            <p>내용</lp>
            <textarea name="noBody" class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="내용 입력"></textarea><br>
         </div>
               
		<!-- 파일추가 -->  
         <div class="fw-bold fs-5 col-12 mt-3">
            <label for="files" class="form-label">Image</label>
            <input type="file" class="form-control" id="files" name="multipartFile">
         </div>         
         
         <div class="row justify-content-center my-5">
            <button type="submit" class="btn btn-primary col-2">전송</button>
         </div>
      </div>
   </form>
</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>