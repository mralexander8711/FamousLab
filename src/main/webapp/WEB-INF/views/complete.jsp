<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Famous Lab</title>
</head>
<body>
	<h1>Films</h1>
	<c:forEach var="complete" items="${ complete }">
		<div>
			<h3>#${complete.firstName } - ${ complete.lastName }</h3>
			<p>
				Famous Innovation ${ complete.innovation }
			</p>
		</div>
	</c:forEach>
</body>
</html>