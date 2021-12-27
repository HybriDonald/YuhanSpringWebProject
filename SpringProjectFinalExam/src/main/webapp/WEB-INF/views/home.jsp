<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/resources/layouts/topLayout.jsp" flush="false"/>
	<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/finalExam/resources/pics/maxresdefault.jpeg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/finalExam/resources/pics/maxresdefault.jpeg" class="d-block w-100" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

	<div class="row row-cols-1 row-cols-md-5 g-4 mt-2">
	<c:forEach var="dto" items="${dtos}">
	  <div class="col">
	    <div class="card">
	    <a href="webtoonView?webtoon_no=${dto.webtoon_no}"><img src="${dto.webtoon_pic}" class="card-img-top"></a>
	      <div class="card-body">
	        <a href="webtoonView?webtoon_no=${dto.webtoon_no}" class="text-muted"><h6 class="card-title">${dto.webtoon_title}</h6></a>
	      </div>
	    </div>
	  </div>
	</c:forEach>
  </div>
<jsp:include page="/resources/layouts/bottomLayout.jsp" flush="false"/>
