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
public class MatchesAccountMailingAddressPredicate implements Predicate<Account> {

	private String accountMailingAddress;
	
	public MatchesAccountMailingAddressPredicate(String accountMailingAddress) {
		super();
		this.accountMailingAddress = accountMailingAddress;
	}

	@Override
	public boolean apply(Account account) {
		return account.getAccountMailingAddress().toLowerCase().contains(accountMailingAddress.toLowerCase());
	}

}
