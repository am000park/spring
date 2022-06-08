<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ddd</title>
		
		<!-- Bootstrap CSS -->
	    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<!-- link type="text/css" rel="stylesheet" href="/resources/_static/css/common.css" / -->
	</head>
	<body>
		<tiles:insertAttribute name="header" />
		
		<main>
			<tiles:insertAttribute name="content" />
		</main>
		
		
		<tiles:insertAttribute name="footer" />
	</body>
</html>
