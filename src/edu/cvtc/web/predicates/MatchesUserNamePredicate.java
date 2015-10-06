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
public class MatchesUserNamePredicate implements Predicate<Account> {

	private String userName;
	
	public MatchesUserNamePredicate(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public boolean apply(Account account) {
		return account.getUserName().toLowerCase().contains(userName.toLowerCase());
	}

}
