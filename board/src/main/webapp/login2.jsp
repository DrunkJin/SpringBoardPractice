<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<h1> Login</h1>
<a href="/board/list">Go to Board</a><br />
<body>

		<form>
			<c:if test="${member == null}">
			<div>
				<label for="userId"></label>
				<input type="text" id="userId" name="userId">
			</div>
			<div>
				<label for="userPass"></label>
				<input type="password" id="userPass" name="userPass">
			</div>
			<div>
				<button type="" onclick="location='/member/register'">Login</button>
				<button type="button" onclick="location='/member/register'">Join us</button>
			</div>
		</c:if>
</form>
<form>
		<c:if test="${member != null }">
			<div>
				<p>Welcome! ${member.userId}</p>
				<button id="logoutBtn" type="button">Logout</button>
			</div>
		</c:if>
		<c:if test="${msg == false}">
			<p style="color: red;">Login failed. Please Check your ID and Password</p>
		</c:if>
</form>
</body>
</html>
