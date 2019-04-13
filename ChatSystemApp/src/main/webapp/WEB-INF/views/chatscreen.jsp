<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  session="false" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/chatscreen.css" />" rel="stylesheet">
</head>
<body>

	<div class="flexside">
		<button id="connection" onclick="connection()">ルーム作成</button>
		<div class="flexcontainer">
			<div class="flexmain" id="response">
			</div>

			<div class="flexfutter">
				<input type="text" id="textinput">
				<button id="send" onclick="send()">送信</button>	
			</div>
		</div>
	</div>

<script src="<c:url value="/resources/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/stomp.min.js" />"></script>
<script src="<c:url value="/resources/js/sockjs.js" />"></script>
<script src="<c:url value="/resources/js/sockjs.min.js" />"></script>
<script src="<c:url value="/resources/js/chatscreen.js" />"></script>
</body>
</html>