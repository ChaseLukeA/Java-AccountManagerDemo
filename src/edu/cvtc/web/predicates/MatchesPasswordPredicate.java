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
public class MatchesPasswordPredicate implements Predicate<Account> {

	private String password;
	
	public MatchesPasswordPredicate(String password) {
		super();
		this.password = password;
	}

	@Override
	public boolean apply(Account account) {
		return account.getPassword().toLowerCase().contains(password.toLowerCase());
	}

}
