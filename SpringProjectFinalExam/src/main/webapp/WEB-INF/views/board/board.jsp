<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/resources/layouts/topLayout.jsp"/>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col" class="text-center">제목</th>
      <th scope="col" class="text-center">작성자</th>
      <th scope="col" class="text-center">작성일</th>
      <th scope="col" class="text-center">조회수</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="dto" items="${dtos}">
    <tr>
      <td style="width: 60%">
      <a class="text-reset" href="boardView?board_no=${dto.board_no}">${dto.board_title}</a>
      </td>
      <td style="width: 10%" class="text-center">${dto.board_auth}</td>
      <td style="width: 20%"class="text-center">${dto.board_date}</td>
      <td style="width: 10%"class="text-center">${dto.board_count}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<a href="boardWrite" class="btn btn-secondary" id="write">글쓰기</a>

<div class="col text-center mt-2">
				
				<nav aria-label="Page navigation example">
			  		<ul class="pagination justify-content-center">
					    <c:forEach var="i" begin="${startpage}" end="${endpage}">
					    	<c:choose>
					    		<c:when test="${currentPage eq i}">
					    			<li class="page-item active"><a class="page-link" href="webtoonList?currentPage=${i}">${i}</a></li>
					    		</c:when>
					    		<c:otherwise>
					    			<li class="page-item"><a class="page-link" href="webtoonList?currentPage=${i}">${i}</a></li>
					    		</c:otherwise>
					    	</c:choose>
						</c:forEach>
				  	</ul>
				</nav>
				
					
				</div>

<jsp:include page="/resources/layouts/bottomLayout.jsp"/>