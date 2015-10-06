<!doctype html>
<html>
<head>
<title>Account Manager - Error Page</title>
<meta name="description" content="The page displayed when the application encounters an error.">
<jsp:include page="include/styles.jsp"></jsp:include>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Error</h1>
	</div>
	<jsp:include page="include/navigation.jsp"></jsp:include>
	<div class="container">
		<h4>${error}</h4>
	</div>
	<hr>
<jsp:include page="include/footer.jsp"></jsp:include>