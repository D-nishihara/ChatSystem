<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  session="false" %>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
	<title>Home</title>
</head>
<body>
	<div class="container">
		<form method="POST" action="/chat/chatcontroller">
			<div class="form-group">
				<label>ユーザーID：</label>
				<input type="text" name="userId">
			</div>
			<div class="form-group">
				<label>パスワード：</label>
				<input type="text" name="userPassword">			
			</div>
			<button type="submit">ログイン</button>
		</form>
	</div>
<script src="<c:url value="/resources/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
