/**
 * 
 */
package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Account;

/**
 * @author ChaseLukeA
 *
 */
public class MatchesAccountPredicate implements Predicate<Account> {

	private String searchTerm;
	
	public MatchesAccountPredicate(String searchTerm) {
		super();
		this.searchTerm = searchTerm;
	}

	@Override
	public boolean apply(Account account) {
		return (account.getAccountName().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getUrl().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getEmailAddress().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getUserName().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getPassword().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getNotes().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getStorageSize().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getAccountNumber().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getRoutingNumber().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getCardNumber().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getExpirationDate().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getCvvNumber().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getAccountMailingAddress().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getAccountPhoneNumber().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getSecretQuestion().toLowerCase().contains(searchTerm.toLowerCase()) ||
				account.getSecretAnswer().toLowerCase().contains(searchTerm.toLowerCase()));
	}

}
