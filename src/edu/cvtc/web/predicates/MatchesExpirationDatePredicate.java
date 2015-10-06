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
public class MatchesExpirationDatePredicate implements Predicate<Account> {

	private String expirationDate;
	
	public MatchesExpirationDatePredicate(String expirationDate) {
		super();
		this.expirationDate = expirationDate;
	}

	@Override
	public boolean apply(Account account) {
		return account.getExpirationDate().toLowerCase().contains(expirationDate.toLowerCase());
	}

}
