<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>${pageTitle}</title>
<meta name="description" content="This is the results page where all accounts and search results for accounts are displayed.">
<%@ include file="include/styles.jsp"  %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>${headerTitle}</h1>
		<h3>${headerDetails}</h3>
	</div>
	<%@ include file="include/navigation.jsp"  %>
	<div class="container">
	<c:choose>
		<c:when test="${empty accounts}">
			<h4>Sorry, we were unable to find an account containing that search term.</h4>
		</c:when>
		<c:otherwise>
			<c:forEach var="account" items="${accounts}">
				<div class="span4">
					<h2>${account.accountName}</h2>
					<div class="account-record">
						<table>
						<tr><td>Account Name:</td><td>${account.accountName}</td></tr>
						<tr><td>URL:</td><td><a href="${account.url}" target="_blank">${account.url}</a></td></tr>
						<tr><td>Email Address:</td><td>${account.emailAddress}</td></tr>
						<tr><td>UserName:</td><td>${account.userName}</td></tr>
						<tr><td>Password:</td><td>${account.password}</td></tr>
						<tr><td>Notes:</td><td>${account.notes}</td></tr>
						<tr><td>Storage Size:</td><td>${account.storageSize}</td></tr>
						</table>
					</div>
					<div class="account-record">
						<table>
						<tr><td>Account Number:</td><td>${account.accountNumber}</td></tr>
						<tr><td>Routing Number:</td><td>${account.routingNumber}</td></tr>
						<tr><td>Card Number:</td><td>${account.cardNumber}</td></tr>
						<tr><td>Expiration Date:</td><td>${account.expirationDate}</td></tr>
						<tr><td>CVV Number:</td><td>${account.cvvNumber}</td></tr>
						<tr><td>Account Mailing Address:</td><td>${account.accountMailingAddress}</td></tr>
						<tr><td>Account Phone Number:</td><td>${account.accountPhoneNumber}</td></tr>
						<tr><td>Secret Question:</td><td>${account.secretQuestion}</td></tr>
						<tr><td>Secret Answer:</td><td>${account.secretAnswer}</td></tr>
						</table>
					</div>
					<%@ include file="include/update-delete.jsp" %>
				</div>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	</div>
	<hr />
<%@ include file="include/footer.jsp"  %>