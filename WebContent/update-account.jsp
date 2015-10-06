<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>Account Manager - Update Account</title>
<meta name="description" content="Update the information for your accounts.">
<%@ include file="include/styles.jsp"  %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Update Account</h1>
	</div>
	<%@ include file="include/navigation.jsp"  %>
	<div class="container">
		<form action="UpdateAccount" method="post">
			<div class="form-group my-form">
				<label for="accountName"><strong>Account Name</strong></label>
				<input name="accountName" value="${param.accountName}" id="accountName">

				<label for="url"><strong>URL</strong></label>
				<input name="url" value="${param.url}">

				<label for="emailAddress"><strong>Email Address</strong></label>
				<input name="emailAddress" value="${param.emailAddress}">

				<label for="userName"><strong>UserName</strong></label>
				<input name="userName" value="${param.userName}">

				<label for="password"><strong>Password</strong></label>
				<input name="password" value="${param.password}">

				<label for="notes"><strong>Notes</strong></label>
				<textarea name="notes" rows="3">${param.notes}</textarea>
			</div>
			<div class="form-group my-form">
				<label for="storageSize"><strong>Storage Size</strong></label>
				<input name="storageSize" value="${param.storageSize}">

				<label for="accountNumber"><strong>Account Number</strong></label>
				<input name="accountNumber" value="${param.accountNumber}">

				<label for="routingNumber"><strong>Routing Number</strong></label>
				<input name="routingNumber" value="${param.routingNumber}">

				<label for="cardNumber"><strong>Card Number</strong></label>
				<input name="cardNumber" value="${param.cardNumber}">

				<label for="expirationDate"><strong>Expiration Date</strong></label>
				<input name="expirationDate" value="${param.expirationDate}">

				<label for="cvvNumber"><strong>CVV Number</strong></label>
				<input name="cvvNumber" value="${param.cvvNumber}">
			</div>
			<div class="form-group my-form">
				<label for="accountMailingAddress"><strong>Account Mailing Address</strong></label>
				<textarea name="accountMailingAddress" rows="3">${param.accountMailingAddress}</textarea>

				<label for="accountPhoneNumber"><strong>Account Phone Number</strong></label>
				<input name="accountPhoneNumber" value="${param.accountPhoneNumber}">

				<label for="secretQuestion"><strong>Secret Question</strong></label>
				<input name="secretQuestion" value="${param.secretQuestion}">

				<label for="secretAnswer"><strong>Secret Answer</strong></label>
				<input name="secretAnswer" value="${param.secretAnswer}">

				<input name="accountId" value="${param.accountId}" style="display:none">
				<br><br>
				<input class="btn btn-primary btn-lg" type="submit" value="Update Account">
			</div>
		</form>
	</div>
	<hr>
<%@ include file="include/footer.jsp"  %>
<script src="assets/js/inputVerify.js" type="text/javascript"></script>