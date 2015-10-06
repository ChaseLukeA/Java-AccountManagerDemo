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
public class MatchesUrlPredicate implements Predicate<Account> {

	private String url;
	
	public MatchesUrlPredicate(String url) {
		super();
		this.url = url;
	}

	@Override
	public boolean apply(Account account) {
		return account.getUrl().toLowerCase().contains(url.toLowerCase());
	}

}
