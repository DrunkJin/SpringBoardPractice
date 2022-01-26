<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>

	<div id="root">
			<header>
				<h1> 게시판</h1>
			</header>
			<hr />
			 
			<nav>
			  게시글 상세보기
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post" action="/board/update">
					<input type="hidden" name="bno" value="${update.bno}" readonly="readonly"/>
					<table>
						<tbody>
							<tr>
								<td>
									<label for="title">제목</label><input type="text" id="title" name="title" value="${update.title}"/>
								</td>
							</tr>	 
							<tr>
								<td>
									<label for="content">내용</label><textarea id="content" name="content"  ><c:out value="${update.content}" /></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${update.writer}" readonly="readonly"/>
								</td>
							</tr>
							<tr>
								<td>
									<label for = "regdate">작성날짜</label>						
									<input value="${update.regdate}">
								</td>
							</tr>
						</tbody>	
						<input type="submit" value="수정하기">
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