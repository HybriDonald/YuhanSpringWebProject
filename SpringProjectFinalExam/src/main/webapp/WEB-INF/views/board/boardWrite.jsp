<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<jsp:include page="/resources/layouts/topLayout.jsp"/>
<%
//request.setCharacterEncoding("UTF-8");
//int num = 0, ref = 1, re_step=0, re_level=0;

//if(session.getAttribute("id") == null) {
//	out.println("<script>alert('비회원은 글쓰기를 할 수 없습니다.'); location.href='board.jsp';</script>");
//}


%>



<form action="boardWrite.do" method="post">
			<input type="text" name="board_title" class="form-control form-control-lg mt-4 mb-2" placeholder="제목" required>
			
			<textarea class="form-control" name="board_content" rows="15" placeholder="내용" required></textarea>
			<div class="form-row">
				<div class="col-md-4 my-4" style="float:none; margin:0 auto; text-align:center;">
					<a href="javascript:history.back();" class="btn btn-secondary btn-block">뒤로가기</a>
					<input type="submit" class="btn btn-success btn-block" value="작성완료">	
				</div>
			</div>
			
			
</form>


<jsp:include page="/resources/layouts/bottomLayout.jsp"/>