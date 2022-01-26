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
			  게시글 삭제
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post" action="/board/delete">
					<input type="hidden" name="bno" value="${delete.bno}" />
					<table>
						<tbody>
							<h3>
								정말로 글을 삭제하시겠습니까?
							</h3>
						</tbody>
						<input type="submit" value="삭제하기">	
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