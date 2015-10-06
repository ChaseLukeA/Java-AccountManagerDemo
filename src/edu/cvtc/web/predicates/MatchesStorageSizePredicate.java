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
public class MatchesStorageSizePredicate implements Predicate<Account> {

	private String storageSize;
	
	public MatchesStorageSizePredicate(String storageSize) {
		super();
		this.storageSize = storageSize;
	}

	@Override
	public boolean apply(Account account) {
		return account.getStorageSize().toLowerCase().contains(storageSize.toLowerCase());
	}

}
