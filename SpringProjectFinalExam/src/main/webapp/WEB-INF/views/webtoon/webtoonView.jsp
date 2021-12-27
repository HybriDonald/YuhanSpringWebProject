<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/resources/layouts/topLayout.jsp" flush="false" />

<div class="container">
<div class="row" style="height:700px;">
<table class="table" style="height:300px; margin:auto;">
  <tbody>
  	<tr>
  		<td scope="row" rowspan="4">
  		<div style="margin:auto;">
  			<img src="${dto.webtoon_pic}">
  		</div>
  		</td>
  	</tr>
    <tr>
      <th scope="row">제목</th>
      <td>
      	${dto.webtoon_title}
      </td>
    </tr>
    <tr>
      <th scope="row">사이트</th>
      <td>
      	${dto.webtoon_comp}
      </td>
    </tr>
    <tr class="w-50">
      <th scope="row">줄거리</th>
      <td style="width:65%;">
      	${dto.webtoon_desc}
      </td>
    </tr>
  </tbody>
</table>
</div>

</div>

<jsp:include page="/resources/layouts/bottomLayout.jsp" flush="false"/>