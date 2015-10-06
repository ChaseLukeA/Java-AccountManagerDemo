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
public class MatchesSecretAnswerPredicate implements Predicate<Account> {

	private String secretAnswer;
	
	public MatchesSecretAnswerPredicate(String secretAnswer) {
		super();
		this.secretAnswer = secretAnswer;
	}

	@Override
	public boolean apply(Account account) {
		return account.getSecretAnswer().toLowerCase().contains(secretAnswer.toLowerCase());
	}

}
