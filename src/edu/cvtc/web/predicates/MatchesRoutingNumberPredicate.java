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
public class MatchesRoutingNumberPredicate implements Predicate<Account> {

	private String routingNumber;
	
	public MatchesRoutingNumberPredicate(String routingNumber) {
		super();
		this.routingNumber = routingNumber;
	}

	@Override
	public boolean apply(Account account) {
		return account.getRoutingNumber().toLowerCase().contains(routingNumber.toLowerCase());
	}

}
