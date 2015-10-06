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
public class MatchesNotesPredicate implements Predicate<Account> {

	private String notes;
	
	public MatchesNotesPredicate(String notes) {
		super();
		this.notes = notes;
	}

	@Override
	public boolean apply(Account account) {
		return account.getNotes().toLowerCase().contains(notes.toLowerCase());
	}

}
