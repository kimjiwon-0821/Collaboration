<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid my-5">
   <div class="row col-md-4 mx-auto text-center border-bottom border-dark pb-2">
     <p class="fs-2" style="font-family: 'Impact'">Notice Add Page</p>
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
            <button type="submit" class="btn btn-outline-warning col-2">전송</button>
         </div>
      </div>
   </form>
</div>
</body>
</html>