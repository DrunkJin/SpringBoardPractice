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
			  홈 - 글 작성
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post">
					<table>
						<tbody>
							<tr>
								<td>
									<label for="bno">글번호</label><input type="text" id="bno" name="bno" value="${read.bno}" />
								</td>
								<td>
									<label for="title">제목</label><input type="text" id="title" name="title" value = "${read.title}"/>
								</td>
							</tr>	 
							<tr>
								<td>
									<label for="content">내용</label><textarea id="content" name="content"  ><c:out value="${read.content}" /></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="writer" name="writer" value = "${read.writer}"/>
								</td>
							<tr>
								<td>
									<label for = "regdate">작성날짜</label>						
									<input value="${read.regdate}">
								</td>
							</tr>
						</tbody>		
					<form>
						<input type='button' value='글 수정' onclick="location='/board/updateView?bno=${read.bno}'"/>
					</form>	
					</table>
				</form>
				<form>
					<input type='button' value='목록보기' onclick="location='/board/list'"/>
				</form>
				<input type='button' value='삭제하기' onclick="location='/board/deleteView?bno=${read.bno}'"/>
				</form>
			</section>
			<hr />
		</div>
</body>
</html>