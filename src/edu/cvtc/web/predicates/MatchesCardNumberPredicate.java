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
public class MatchesCardNumberPredicate implements Predicate<Account> {

	private String cardNumber;
	
	public MatchesCardNumberPredicate(String cardNumber) {
		super();
		this.cardNumber = cardNumber;
	}

	@Override
	public boolean apply(Account account) {
		return account.getCardNumber().toLowerCase().contains(cardNumber.toLowerCase());
	}

}
