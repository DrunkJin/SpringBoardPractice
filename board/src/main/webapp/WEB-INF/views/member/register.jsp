<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<div id="root">
			<header>
				<h1> 회원가입</h1>
			</header>
			<hr />
			 
			<nav>
			  회원가입
			</nav>
			<hr />

			<section id="container">		
				<form role="form" method="post" action="/member/register">
							<table>
								<tbody>
									<tr>
										<td>
											<label for="userId">아이디</label><input type="text" id="userId" name="userId" />
										</td>
									</tr>	 
									<tr>
										<td>
											<label for="userPass">비밀번호</label><input id="userPass" name="userPass" ></input>
										</td>
									</tr>
									<tr>
										<td>
											<label for="userName">이름</label><input type="text" id="userName" name="userName" />
										</td>
									<tr>
										<td>						
											<button type="submit">회원가입</button>
										</td>
									</tr>			
								</tbody>			
							</table>
						</form>
						<form>
							<input type='button' value='취소하기' onclick="location='/board/list'"/>
						</form>
				</section>

</body>
</html>