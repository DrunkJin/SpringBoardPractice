<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>

	<div id="root">
			<header>
				<h1> 게시판</h1>
			</header>
			<hr />
			 
			<nav>
			  홈 - 글 작성
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post" action="/board/write" enctype="multipart/form-data">
					<table>
						<tbody>
				<c:if test="${member.userId != null}">
							<tr>
								<td>
									<label for="title">제목</label><input type="text" id="title" name="title" />
								</td>
							</tr>	 
							<tr>
								<td>
									<label for="content">내용</label><textarea id="content" name="content" ></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${member.userId}" />
								</td>
							<tr>
									<td>
										<input type="file" name="file">
									</td>
							<tr>
								<td>						
									<button type="submit">작성</button>
								</td>
							</tr>
				</c:if>
				<c:if test="${member.userId == null}">
					<p>로그인 후에 작성하실 수 있습니다.</p>
				</c:if>			
						</tbody>			
					</table>
				</form>
				<form>
					<input type='button' value='목록보기' onclick="location='/board/list'"/>
				</form>
			</section>
			<hr />
		</div>
</body>
</html>