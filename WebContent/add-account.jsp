<!doctype html>
<html>
<head>
<title>Account Manager - Add Account</title>
<meta name="description" content="Add a new account to your account list.">
<%@ include file="include/styles.jsp"  %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Add Account</h1>
	</div>
	<%@ include file="include/navigation.jsp"  %>
	<div class="container">
		<form action="AddAccount" method="post">
			<div class="form-group my-form">
				<label for="accountName"><strong>Account Name</strong></label>
				<input name="accountName" id="accountName">

				<label for="url"><strong>URL</strong></label>
				<input name="url" value="http://">

				<label for="emailAddress"><strong>Email Address</strong></label>
				<input name="emailAddress">

				<label for="userName"><strong>UserName</strong></label>
				<input name="userName">

				<label for="password"><strong>Password</strong></label>
				<input name="password">

				<label for="notes"><strong>Notes</strong></label>
				<textarea name="notes" rows="3"></textarea>
			</div>
			<div class="form-group my-form">
				<label for="storageSize"><strong>Storage Size</strong></label>
				<input name="storageSize">

				<label for="accountNumber"><strong>Account Number</strong></label>
				<input name="accountNumber">

				<label for="routingNumber"><strong>Routing Number</strong></label>
				<input name="routingNumber">

				<label for="cardNumber"><strong>Card Number</strong></label>
				<input name="cardNumber">

				<label for="expirationDate"><strong>Expiration Date</strong></label>
				<input name="expirationDate">

				<label for="cvvNumber"><strong>CVV Number</strong></label>
				<input name="cvvNumber">
			</div>
			<div class="form-group my-form">
				<label for="accountMailingAddress"><strong>Account Mailing Address</strong></label>
				<textarea name="accountMailingAddress" rows="3"></textarea>

				<label for="accountPhoneNumber"><strong>Account Phone Number</strong></label>
				<input name="accountPhoneNumber">

				<label for="secretQuestion"><strong>Secret Question</strong></label>
				<input name="secretQuestion">

				<label for="secretAnswer"><strong>Secret Answer</strong></label>
				<input name="secretAnswer">
				<br><br>
				<input class="btn btn-primary btn-lg" type="submit" value="Add Account">
			</div>
		</form>
	</div>
	<hr>
<%@ include file="include/footer.jsp"  %>
<script src="assets/js/inputVerify.js" type="text/javascript"></script>