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
public class MatchesCVVNumberPredicate implements Predicate<Account> {

	private String cvvNumber;
	
	public MatchesCVVNumberPredicate(String cvvNumber) {
		super();
		this.cvvNumber = cvvNumber;
	}

	@Override
	public boolean apply(Account account) {
		return account.getCvvNumber().toLowerCase().contains(cvvNumber.toLowerCase());
	}

}
