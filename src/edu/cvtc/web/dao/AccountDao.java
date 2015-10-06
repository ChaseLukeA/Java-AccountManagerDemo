/**
 * 
 */
package edu.cvtc.web.dao;

import java.util.List;

import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;

/**
 * @author ChaseLukeA
 *
 */
public interface AccountDao {

	List<Account> retrieveAccountsFromDatabase() throws AccountManagerException;

	Integer insertAccount(Account account) throws AccountManagerException;

	Integer updateAccount(Account account) throws AccountManagerException;
	
	Integer deleteAccount(Account account) throws AccountManagerException;

}
