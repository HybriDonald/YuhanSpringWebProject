<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<jsp:include page="/resources/layouts/topLayout.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-6" style="float:none; margin:auto;">
				<form method="post" action="register.do" id="signUp">
					<h1 class="my-3 text-center">회원가입</h1>
					
				        <div class="input-group my-2">
				        	<div class="input-group w-100">
								<span class="input-group-text" id="basic-addon1">
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
  										<path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10z"/>
									</svg>
								</span>
				        		<input type="text" id="id" name="id" class="form-control" placeholder="아이디" required>
				        	</div>
				        </div>
				        
				        <div class="form-row">
					        <div class="input-group col-md-6 col-sm-6 col-6">
					        	<div class="input-group w-50">
									<span class="input-group-text" id="basic-addon1">
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-key" viewBox="0 0 16 16">
									  <path d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8zm4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5z"/>
									  <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
									</svg>
									</span>
					        		<input type="password" name="passwd" id="passwd" class="form-control" placeholder="패스워드" required>
					        	</div>
					        	<div class="input-group w-50">
									<input type="password" name="passwdre" id="passwdre" class="form-control" placeholder="패스워드 확인" required>
					        	</div>
					        </div>
				        </div>
				        <!-- 비밀번호 .form-row -->
				        
				        <div class="form-row">
				        	<div class="col-md-12 col-sm-12 col-12">
					        	<div class="input-group my-2">
						        	<div class="input-group">
										<span class="input-group-text" id="basic-addon1">
											<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-envelope" viewBox="0 0 16 16">
  												<path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z"/>
											</svg>
										</span>
										<div class="col-5">
						        			<input type="text" id="emailForward" class="form-control" placeholder="이메일 주소" required>
										</div>
								        	<select class="form-select" id="emailBackward">
								        		<option value="naver.com">naver.com</option>
								        		<option value="daum.net">daum.net</option>
								        		<option value="nate.com">nate.com</option>
								        		<option value="google.com">google.com</option>
								        	</select>
						        	</div>
						        </div>
				        	</div>
					        <input type="hidden" id="email" name="email">
				        </div>
				        <!-- 이메일 .form-row -->
				        
				        <div class="input-group">
								<span class="input-group-text">
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-emoji-smile" viewBox="0 0 16 16">
									  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
									  <path d="M4.285 9.567a.5.5 0 0 1 .683.183A3.498 3.498 0 0 0 8 11.5a3.498 3.498 0 0 0 3.032-1.75.5.5 0 1 1 .866.5A4.498 4.498 0 0 1 8 12.5a4.498 4.498 0 0 1-3.898-2.25.5.5 0 0 1 .183-.683zM7 6.5C7 7.328 6.552 8 6 8s-1-.672-1-1.5S5.448 5 6 5s1 .672 1 1.5zm4 0c0 .828-.448 1.5-1 1.5s-1-.672-1-1.5S9.448 5 10 5s1 .672 1 1.5z"/>
									</svg>
								</span>
				        	<input type="text" id="name" name="name" class="form-control" placeholder="이름" required>
				        </div>
				        
				        <div class="input-group my-2">
								<span class="input-group-text">
									<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-flag" viewBox="0 0 16 16">
									  <path d="M14.778.085A.5.5 0 0 1 15 .5V8a.5.5 0 0 1-.314.464L14.5 8l.186.464-.003.001-.006.003-.023.009a12.435 12.435 0 0 1-.397.15c-.264.095-.631.223-1.047.35-.816.252-1.879.523-2.71.523-.847 0-1.548-.28-2.158-.525l-.028-.01C7.68 8.71 7.14 8.5 6.5 8.5c-.7 0-1.638.23-2.437.477A19.626 19.626 0 0 0 3 9.342V15.5a.5.5 0 0 1-1 0V.5a.5.5 0 0 1 1 0v.282c.226-.079.496-.17.79-.26C4.606.272 5.67 0 6.5 0c.84 0 1.524.277 2.121.519l.043.018C9.286.788 9.828 1 10.5 1c.7 0 1.638-.23 2.437-.477a19.587 19.587 0 0 0 1.349-.476l.019-.007.004-.002h.001M14 1.221c-.22.078-.48.167-.766.255-.81.252-1.872.523-2.734.523-.886 0-1.592-.286-2.203-.534l-.008-.003C7.662 1.21 7.139 1 6.5 1c-.669 0-1.606.229-2.415.478A21.294 21.294 0 0 0 3 1.845v6.433c.22-.078.48-.167.766-.255C4.576 7.77 5.638 7.5 6.5 7.5c.847 0 1.548.28 2.158.525l.028.01C9.32 8.29 9.86 8.5 10.5 8.5c.668 0 1.606-.229 2.415-.478A21.317 21.317 0 0 0 14 7.655V1.222z"/>
									</svg>
								</span>
				        	<input type="text" id="address" name="address" class="form-control" placeholder="주소" required>
				        </div>
				        
				        <div class="form-row">
				        	<div class="col-md-12 col-sm-12 col-12">
				        		<div class="input-group">
										<span class="input-group-text">
											<svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-phone" viewBox="0 0 16 16">
									  			<path d="M11 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h6zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z"/>
									  			<path d="M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z"/>
											</svg>
										</span>
					        		<select class="form-select form-control" id="telFirst">
					        			<option value="010">010</option>
					        			<option value="070">070</option>
					        			<option value="02">02</option>
					        			<option value="031">031</option>
					        			<option value="032">032</option>
					        			<option value="041">041</option>
					        			<option value="042">042</option>
					        		</select>
					        		<input type="text" id="telMiddle" class="form-control" placeholder="0000" minlength="3" maxlength="4" required>
					        		<input type="text" id="telLast" class="form-control" placeholder="0000"  minlength="4" maxlength="4"required>
				        		</div>
				        	</div>
				        	<input type="hidden" id="tel" name="tel">
				        </div>
				        <!-- 전화번호 .form-row -->
				        
				        <div class="input-group my-2">
				        	<div class="input-group-prepend">
								<span class="input-group-text">생년월일</span>
				        	</div>
				        	<input type="date" id="birth" name="birth" class="form-control"required>
				        </div>
				        
				        <div class="form-row">
	        				<button class="btn btn-secondary btn-block" type="reset">다시작성</button>
	        				<input class="btn btn-primary btn-block" id="registerBtn" type="submit" value="회원가입">
				        </div>				        	        
				</form>
				<script type="text/javascript" src="resources/js/customScript.js"></script>
		
			</div>
			<!-- .col-lg-6 -->
		</div>
		<!-- .row -->
	</div>
	<!-- container -->
	
	
<jsp:include page="/resources/layouts/bottomLayout.jsp"></jsp:include>