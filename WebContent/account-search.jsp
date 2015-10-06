<!doctype html>
<html>
<head>
<title>Account Manager - Account Search</title>
<meta name="description" content="Search for a specific account.">
<%@ include file="include/styles.jsp"  %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Account Search</h1>
	</div>
	<%@ include file="include/navigation.jsp"  %>
	<h3>Search Accounts by Specific Field</h3>
	<div class="container">
		<form action="SearchAccounts" method="post">
			<div class="form-group">
				<label for="searchType"><strong>Search by field:</strong></label>
				<select name="searchType">	
					<option value="accountName">Account Name</option>
					<option value="url">URL</option>
					<option value="emailAddress">Email Address</option>
					<option value="userName">UserName</option>
					<option value="password">Password</option>
					<option value="notes">Notes</option>
					<option value="storageSize">Storage Size</option>
					<option value="accountNumber">Account Number</option>
					<option value="routingNumber">Routing Number</option>
					<option value="cardNumber">Card Number</option>
					<option value="expirationDate">Expiration Date</option>
					<option value="cvvNumber">CVV Number</option>
					<option value="accountMailingAddress">Account Mailing Address</option>
					<option value="accountPhoneNumber">Account Phone Number</option>
					<option value="secretQuestion">Secret Question</option>
					<option value="secretAnswer">Secret Answer</option>	
				</select><br>
				<label for="searchTerm"><strong>Search term:</strong></label>
				<input name="searchTerm" id="byField-input">
				<label for="sortType"><strong>Sort results by:</strong></label>
				<select name="sortType">	
					<option value="">Default (unsorted)</option>
					<option value="accountName">Account Name</option>
					<option value="url">URL</option>
					<option value="emailAddress">Email Address</option>
					<option value="userName">UserName</option>
					<option value="password">Password</option>
					<option value="notes">Notes</option>
					<option value="storageSize">Storage Size</option>
					<option value="accountNumber">Account Number</option>
					<option value="routingNumber">Routing Number</option>
					<option value="cardNumber">Card Number</option>
					<option value="expirationDate">Expiration Date</option>
					<option value="cvvNumber">CVV Number</option>
					<option value="accountMailingAddress">Account Mailing Address</option>
					<option value="accountPhoneNumber">Account Phone Number</option>
					<option value="secretQuestion">Secret Question</option>
					<option value="secretAnswer">Secret Answer</option>	
				</select>
				<input class="btn btn-primary btn-lg" id="byField-button" type="submit" value="Search">
			</div>
		</form>
	<hr>
	</div>
	<h3>Search Accounts by All Fields</h3>
	<div class="container">
		<form action="SearchAccounts" method="post">
			<div class="form-group">
				<label for="searchTerm"><strong>Search all account fields:</strong></label>
				<input name="searchTerm" id="allFields-input">
				<input name="searchType" value="searchAll" style="display:none">
				<label for="sortType"><strong>Sort results by:</strong></label>
				<select name="sortType">	
					<option value="">Default (unsorted)</option>
					<option value="accountName">Account Name</option>
					<option value="url">URL</option>
					<option value="emailAddress">Email Address</option>
					<option value="userName">UserName</option>
					<option value="password">Password</option>
					<option value="notes">Notes</option>
					<option value="storageSize">Storage Size</option>
					<option value="accountNumber">Account Number</option>
					<option value="routingNumber">Routing Number</option>
					<option value="cardNumber">Card Number</option>
					<option value="expirationDate">Expiration Date</option>
					<option value="cvvNumber">CVV Number</option>
					<option value="accountMailingAddress">Account Mailing Address</option>
					<option value="accountPhoneNumber">Account Phone Number</option>
					<option value="secretQuestion">Secret Question</option>
					<option value="secretAnswer">Secret Answer</option>	
				</select>
				<input class="btn btn-primary btn-lg" id="allFields-button" type="submit" value="Search">
			</div>
		</form>
	<hr>
	</div>
<%@ include file="include/footer.jsp"  %>
<script src="assets/js/searchInputVerify.js" type="text/javascript"></script>