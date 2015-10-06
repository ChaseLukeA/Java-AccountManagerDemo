			<form action="update-account.jsp" method="post">
				<div class="form-update-delete form-update">
					<input name="accountName" value="${account.accountName}" style="display:none">
					<input name="url" value="${account.url}" style="display:none">
					<input name="emailAddress" value="${account.emailAddress}" style="display:none">
					<input name="userName" value="${account.userName}" style="display:none">
					<input name="password" value="${account.password}" style="display:none">
					<input name="notes" value="${account.notes}" style="display:none">
					<input name="storageSize" value="${account.storageSize}" style="display:none">
					<input name="accountNumber" value="${account.accountNumber}" style="display:none">
					<input name="routingNumber" value="${account.routingNumber}" style="display:none">
					<input name="cardNumber" value="${account.cardNumber}" style="display:none">
					<input name="expirationDate" value="${account.expirationDate}" style="display:none">
					<input name="cvvNumber" value="${account.cvvNumber}" style="display:none">
					<input name="accountMailingAddress" value="${account.accountMailingAddress}" style="display:none">
					<input name="accountPhoneNumber" value="${account.accountPhoneNumber}" style="display:none">
					<input name="secretQuestion" value="${account.secretQuestion}" style="display:none">
					<input name="secretAnswer" value="${account.secretAnswer}" style="display:none">
					<input name="accountId" value="${account.accountId}" style="display:none">
					<input class="btn-update-delete btn-update" type="submit" value="Edit">
				</div>
			</form>
			<form action="DeleteAccount" method="post">
				<div class="form-update-delete form-delete">
					<input name="accountId" value="${account.accountId}" style="display:none">
					<input class="btn-update-delete btn-delete" type="submit" value="Delete">
				</div>
			</form>