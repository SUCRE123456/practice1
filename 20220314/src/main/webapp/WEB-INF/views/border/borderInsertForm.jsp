<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>게시글 작성</h1></div>
	<div>
		<form id="frm" action="borderInsert.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="100">작성자</th>
						<td width="150">
							<input type="text" id="borderWriter" name="borderWriter" required="required">
						</td>
						<th width="100">작성일자</th>
						<td width="150">
							<input type="date" id="borderDate" name="borderDate" required="required">
						</td>
					</tr>
					<tr>
						<th>제목</th>
						<td colspan="3">
							<input type="text" size="80" id="borderTitle" name="borderTitle" required="required">
						</td>
					</tr>
					<tr>
						<th>내용</th>
						<td colspan="3">
							<textarea rows="10" cols="80" name="borderContents" ></textarea>
						</td>
					</tr>
				</table>
			</div><br>
			<div>
				<button type="submit">글등록</button>&nbsp;&nbsp;&nbsp;
				<button type="reset">취소</button>&nbsp;&nbsp;&nbsp;
				<button type="button" onclick="location.href='borderList.do'">목 록</button>
				
			</div>
		</form>
	</div>
</div>
</body>
</html>