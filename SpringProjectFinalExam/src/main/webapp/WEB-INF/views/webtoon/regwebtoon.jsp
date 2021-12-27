<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/resources/layouts/topLayout.jsp" flush="false"/>


	<div class="container">
		<div class="row">
	<form action="regweb.do">
		<table class="table table-borderless w-100">
			<tr>
				<td>사진 URL</td>
				<td><input  class="form-control" type="text" name="pic" placeholder="URL을 입력해주세요."></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input  class="form-control" type="text" name="title" placeholder="제목을 입력해주세요."></td>
			</tr>
			<tr>
				<td>제공사</td>
				<td><input  class="form-control" type="text" name="comp" placeholder="사이트를 입력해주세요."></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea class="form-control" name="desc" placeholder="설명을 입력해주세요."></textarea></td>
			</tr>
			<tr>
				<td>
					<input class="btn btn-primary btn-block" type="submit" value="등록">
				</td>
			</tr>
		</table>
	</form>
	</div>
	</div>

<jsp:include page="/resources/layouts/bottomLayout.jsp" flush="false"/>