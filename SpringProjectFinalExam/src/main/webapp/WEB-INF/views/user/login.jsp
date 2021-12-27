<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

	<jsp:include page="/resources/layouts/topLayout.jsp"/>
	
	
	<div class="container position-relative" style="height:500px; align-items:center;">
		<div class="row position-absolute top-50 start-50 translate-middle">
			<div class="col-lg-12" style="float:none; margin:0 auto; text-align:center;">
				<form class="form-signin mb-1" method="post" action="login.do">
				<h2 class="form-signin-heading text-center">로그인</h2>
					
					<div class="input-group mt-3 mb-1">
							<span class="input-group-text">
								<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
									<path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
								</svg>
							</span>
			        	<input type="text" id="user_id" name="user_id" class="form-control" placeholder="아이디를 입력하세요." required autofocus>
					</div>
			       	<div class="input-group mt-1 mb-2">
						<span class="input-group-text">
							<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-key" viewBox="0 0 16 16">
							  <path d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8zm4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5z"/>
							  <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
							</svg>
						</span>
			        	<input type="password" id="user_pw" name="user_pw" class="form-control" placeholder="패스워드를 입력하세요." required>
			        </div>
			        <button class="btn btn-lg btn-dark btn-block" type="submit">로그인</button>
			     </form>
			     <div class="text-muted">아직 가입 안하셨나요? <a class="text-decoration-none" href="register">회원가입</a></div>
			</div>
			<!-- .col-lg-4 -->
		</div>
		<!-- .row -->
	</div>
	<!-- .container -->
	
      <jsp:include page="/resources/layouts/bottomLayout.jsp"/>