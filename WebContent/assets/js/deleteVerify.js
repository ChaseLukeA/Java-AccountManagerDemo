// 						 Created by Luke A Chase - 2015
// ==============================================================================
// deleteVerify adds event listener to all "Delete" result buttons to prevent
// normal action & pop up an "Are you sure?" verification for each delete event
// ==============================================================================

var deleteButton = document.getElementsByClassName("btn-delete");

for (var i = 0; i < deleteButton.length; i++) {
	deleteButton[i].addEventListener("click", function(event) {
		var deleteOK = confirm(
				"Confirm!\n" +
				"Are you sure you want to delete this record?\n" +
				"This action cannot be undone.");
		if (!deleteOK) {
			event.preventDefault();
		}
	});
}