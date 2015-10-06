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
public class MatchesAccountPhoneNumberPredicate implements Predicate<Account> {

	private String accountPhoneNumber;
	
	public MatchesAccountPhoneNumberPredicate(String accountPhoneNumber) {
		super();
		this.accountPhoneNumber = accountPhoneNumber;
	}

	@Override
	public boolean apply(Account account) {
		return account.getAccountPhoneNumber().toLowerCase().contains(accountPhoneNumber.toLowerCase());
	}

}
