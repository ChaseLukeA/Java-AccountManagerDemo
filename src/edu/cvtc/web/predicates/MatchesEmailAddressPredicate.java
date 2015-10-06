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
public class MatchesEmailAddressPredicate implements Predicate<Account> {

	private String emailAddress;
	
	public MatchesEmailAddressPredicate(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}

	@Override
	public boolean apply(Account account) {
		return account.getEmailAddress().toLowerCase().contains(emailAddress.toLowerCase());
	}

}
