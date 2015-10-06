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
public class MatchesAccountNumberPredicate implements Predicate<Account> {

	private String accountNumber;
	
	public MatchesAccountNumberPredicate(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	@Override
	public boolean apply(Account account) {
		return account.getAccountNumber().toLowerCase().contains(accountNumber.toLowerCase());
	}

}
