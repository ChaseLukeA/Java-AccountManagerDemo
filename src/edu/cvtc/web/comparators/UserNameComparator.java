/**
 * 
 */
package edu.cvtc.web.comparators;

import java.util.Comparator;

import edu.cvtc.web.model.Account;

/**
 * @author ChaseLukeA
 *
 */
public class UserNameComparator implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		return account1.getUserName().compareTo(account2.getUserName());
	}

}
