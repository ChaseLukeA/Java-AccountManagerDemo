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
public class MatchesAccountNamePredicate implements Predicate<Account> {

	private String accountName;
	
	public MatchesAccountNamePredicate(String accountName) {
		super();
		this.accountName = accountName;
	}

	@Override
	public boolean apply(Account account) {
		return account.getAccountName().toLowerCase().contains(accountName.toLowerCase());
	}

}
