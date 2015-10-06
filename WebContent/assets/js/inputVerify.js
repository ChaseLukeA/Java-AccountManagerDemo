// 						 Created by Luke A Chase - 2015
// ==============================================================================
// Client-side error-checking for account name on the account add/update form; if
// nothing entered, pops up a msg & puts you back in the "offending" input box
// ==============================================================================

var accountNameInput = document.getElementById("accountName");
var submitButton = document.getElementsByClassName("btn");
submitButton = submitButton[0];

submitButton.addEventListener("click", function(event) {
	if (accountNameInput.value == "") {
		event.preventDefault();
		alert("You must enter at least an Account Name to continue.");
		accountNameInput.placeholder = "Enter account name";
		accountNameInput.focus();
		return false;
	}
});