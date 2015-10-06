/**
 * 
 */
package edu.cvtc.web.search;

import java.util.List;

import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;

/**
 * @author ChaseLukeA
 *
 */
public interface AccountSearch {

	List<Account> retrieveAccounts(String sortType) throws AccountManagerException;

	List<Account> findAccount(String searchType, String searchTerm) throws AccountManagerException;
	
	List<Account> findAccountSortedBy(String searchType, String searchTerm, String sortType) throws AccountManagerException;


}
