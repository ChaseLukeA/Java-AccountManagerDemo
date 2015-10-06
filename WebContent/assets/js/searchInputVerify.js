// 						 Created by Luke A Chase - 2015
// ==============================================================================
// Client-side error-checking for the search field on the account search form; if
// nothing entered, pops up a msg & puts you back in the "offending" input box
// ==============================================================================

var byFieldButton = document.getElementById("byField-button");
var byFieldInput = document.getElementById("byField-input");
var allFieldsButton = document.getElementById("allFields-button");
var allFieldsInput = document.getElementById("allFields-input");

byFieldButton.addEventListener("click", function(event) {
	if (byFieldInput.value == "") {
		event.preventDefault();
		alert("You must enter a term to search for.");
		byFieldInput.placeholder = "Enter search term";
		allFieldsInput.placeholder = "";
		byFieldInput.focus();
		return false;
	}
});

allFieldsButton.addEventListener("click", function(event) {
	if (allFieldsInput.value == "") {
		event.preventDefault();
		alert("You must enter a term to search for.");
		allFieldsInput.placeholder = "Enter search term";
		byFieldInput.placeholder = "";
		allFieldsInput.focus();
		return false;
	}
});