<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<! DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
	<title> Turtle </title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>
		.border-custom {
			border: medium;
			border-style: solid;
			border-radius: 10px;
			border-color: #BDBDBD;
		}
    </style>
    
</head>
<body class="d-flex flex-column h-100 pt-5 bg-light">
  	<nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
  		<div class="container">
  			<div class="navbar-header">
	  			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponse">
	  				<span class="navbar-toggler-icon"></span>
	  			</button>
	  			<a class="navbar-brand" href="home">Turtle</a>
  			</div>
  			
  			<div class="collapse navbar-collapse" id="navbarResponse" style="justify-content: flex-end;">
  				<ul class="navbar-nav ml-auto">
  					<li class="nav-item">
  						<a class="nav-link" href="home">Home
  						</a>
  					</li>
  					<li class="nav-item">
  						<a class="nav-link" href="board">Board</a>
  					</li>
  					
  					<c:if test="${ sessionScope.user_id != null }">
	  					<li class="nav-item">
	  						<a class="nav-link" href="logout.do">Logout</a>
	  					</li>
	  					<li class="nav-item">
	  						<a class="nav-link" href="mypage">${sessionScope.user_id}</a>
	  					</li>
  					</c:if>
  					
  					<c:if test="${ sessionScope.user_id == null }">
	  					<li class="nav-item">
	  						<a class="nav-link" href="register">Sign up</a>
	  					</li>
	  					<li class="nav-item">
	  						<a class="nav-link" href="login">Login</a>
	  					</li>
  					</c:if>
  					
  				</ul>
  			</div>
  		</div>
  	</nav>
  	
  	
	<div class="container">
		<div class="row">
					<% 
						String uri = request.getRequestURI();
						if((!uri.contains("login.jsp")) && (!uri.contains("register.jsp"))) {
					%>
			<div class="col-lg-3">
					<h1 class="my-4 text-center">Menu</h1>
				<div class="list-group mb-4">
					<a class="list-group-item" href="board">자유게시판</a>
					<a class="list-group-item" href="webtoonList">웹툰 목록</a>
				</div>
			</div>
				<% } %>
			<!-- /.col-lg-3 -->
			
			<div class="col-lg-9 my-4 mb-4 border-custom" style=" margin:auto">
			
			
			<!--  /.col-lg-9 -->