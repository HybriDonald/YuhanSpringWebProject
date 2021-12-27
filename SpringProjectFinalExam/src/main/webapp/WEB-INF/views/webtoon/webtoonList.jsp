<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<jsp:include page="/resources/layouts/topLayout.jsp" flush="false"/>


	<div class="container">
		<div class="row">
			<div class="row row-cols-1 row-cols-md-3 g-4 mt-2 mb-4">
				<c:forEach items="${dtos}" var="dto">
					<div class="col">
					    <div class="card">
					      <a href="webtoonView?webtoon_no=${dto.webtoon_no}"><img src="${dto.webtoon_pic}" class="card-img-top"></a>
					      <div class="card-body">
					        <a href="webtoonView?webtoon_no=${dto.webtoon_no}" class="text-muted"><h6 class="card-title">${dto.webtoon_title}</h6></a>
					      </div>
					    </div>
				    </div>
				</c:forEach>
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
		  </div>
		</div>
	</div>

<jsp:include page="/resources/layouts/bottomLayout.jsp" flush="false"/>