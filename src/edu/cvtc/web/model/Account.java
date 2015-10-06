/**
 * 
 */
package edu.cvtc.web.model;

/**
 * @author ChaseLukeA
 *
 */
public class Account {

	private int accountId;
	private String accountName;
	private String url;
	private String emailAddress;
	private String userName;
	private String password;
	private String notes;
	private String storageSize;
	private String accountNumber;
	private String routingNumber;
	private String cardNumber;
	private String expirationDate;
	private String cvvNumber;
	private String accountMailingAddress;
	private String accountPhoneNumber;
	private String secretQuestion;
	private String secretAnswer;
	
	// overridden to remove accountId, only necessary to use this when adding a new account
	// to the database since the accountId is not user-created but database-generated
	public Account(String accountName, String url,
			String emailAddress, String userName, String password,
			String notes, String storageSize, String accountNumber,
			String routingNumber, String cardNumber, String expirationDate,
			String cvvNumber, String accountMailingAddress,
			String accountPhoneNumber, String secretQuestion,
			String secretAnswer) {
		this.accountName = accountName;
		this.url = url;
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.password = password;
		this.notes = notes;
		this.storageSize = storageSize;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvvNumber = cvvNumber;
		this.accountMailingAddress = accountMailingAddress;
		this.accountPhoneNumber = accountPhoneNumber;
		this.secretQuestion = secretQuestion;
		this.secretAnswer = secretAnswer;
	}

	public Account(int accountId, String accountName, String url,
			String emailAddress, String userName, String password,
			String notes, String storageSize, String accountNumber,
			String routingNumber, String cardNumber, String expirationDate,
			String cvvNumber, String accountMailingAddress,
			String accountPhoneNumber, String secretQuestion,
			String secretAnswer) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.url = url;
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.password = password;
		this.notes = notes;
		this.storageSize = storageSize;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvvNumber = cvvNumber;
		this.accountMailingAddress = accountMailingAddress;
		this.accountPhoneNumber = accountPhoneNumber;
		this.secretQuestion = secretQuestion;
		this.secretAnswer = secretAnswer;
	}

	public int getAccountId() {
		return accountId;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public String getAccountMailingAddress() {
		return accountMailingAddress;
	}

	public void setAccountMailingAddress(String accountMailingAddress) {
		this.accountMailingAddress = accountMailingAddress;
	}

	public String getAccountPhoneNumber() {
		return accountPhoneNumber;
	}

	public void setAccountPhoneNumber(String accountPhoneNumber) {
		this.accountPhoneNumber = accountPhoneNumber;
	}

	public String getSecretQuestion() {
		return secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}
	
	// static method to return long, formatted versions of property names for display
	public static String longName(String property) {
		
		final String longName;

		switch (property) {
		case "accountName":
			longName = "Account Name";
			break;
		case "url":
			longName = "URL";
			break;
		case "emailAddress":
			longName = "Email Address";
			break;
		case "userName":
			longName = "UserName";
			break;
		case "password":
			longName = "Password";
			break;
		case "notes":
			longName = "Notes";
			break;
		case "storageSize":
			longName = "Storage Size";
			break;
		case "accountNumber":
			longName = "Account Number";
			break;
		case "routingNumber":
			longName = "Routing Number";
			break;
		case "cardNumber":
			longName = "Card Number";
			break;
		case "expirationDate":
			longName = "Expiration Date";
			break;
		case "cvvNumber":
			longName = "CVV Number";
			break;
		case "accountMailingAddress":
			longName = "Account Mailing Address";
			break;
		case "accountPhoneNumber":
			longName = "Account Phone Number";
			break;
		case "secretQuestion":
			longName = "Secret Question";
			break;
		case "secretAnswer":
			longName = "Secret Answer";
			break;
		case "searchAll":
			longName = "All Fields";
			break;
		default:
			longName = "Default (unsorted)";
		}
		
		return longName;

	}
	
}