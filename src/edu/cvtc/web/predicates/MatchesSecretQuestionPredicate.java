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
public class MatchesSecretQuestionPredicate implements Predicate<Account> {

	private String secretQuestion;
	
	public MatchesSecretQuestionPredicate(String secretQuestion) {
		super();
		this.secretQuestion = secretQuestion;
	}

	@Override
	public boolean apply(Account account) {
		return account.getSecretQuestion().toLowerCase().contains(secretQuestion.toLowerCase());
	}

}
