<!doctype html>
<html>
<head>
<title>Account Manager - Success Page</title>
<meta name="description" content="The page displayed indicating the application completed an action successfully.">
<jsp:include page="include/styles.jsp"></jsp:include>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Success</h1>
	</div>
	<jsp:include page="include/navigation.jsp"></jsp:include>
	<div class="container">
		<h4>${success}</h4>
	</div>
	<hr>
<jsp:include page="include/footer.jsp"></jsp:include>