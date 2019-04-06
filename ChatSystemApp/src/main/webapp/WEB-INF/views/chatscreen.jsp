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
		サイド
		<div class="flexcontainer">
			<div class="flexmain">
				メイン
			</div>

			<div class="flexfutter">
				フッター	
			</div>
		</div>
	</div>

<script src="<c:url value="/resources/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>