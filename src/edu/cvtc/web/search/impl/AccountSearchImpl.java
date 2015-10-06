/**
 * 
 */
package edu.cvtc.web.search.impl;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import edu.cvtc.web.comparators.AccountMailingAddressComparator;
import edu.cvtc.web.comparators.AccountNameComparator;
import edu.cvtc.web.comparators.AccountNumberComparator;
import edu.cvtc.web.comparators.AccountPhoneNumberComparator;
import edu.cvtc.web.comparators.CVVNumberComparator;
import edu.cvtc.web.comparators.CardNumberComparator;
import edu.cvtc.web.comparators.EmailAddressComparator;
import edu.cvtc.web.comparators.ExpirationDateComparator;
import edu.cvtc.web.comparators.NotesComparator;
import edu.cvtc.web.comparators.PasswordComparator;
import edu.cvtc.web.comparators.RoutingNumberComparator;
import edu.cvtc.web.comparators.SecretAnswerComparator;
import edu.cvtc.web.comparators.SecretQuestionComparator;
import edu.cvtc.web.comparators.StorageSizeComparator;
import edu.cvtc.web.comparators.UrlComparator;
import edu.cvtc.web.comparators.UserNameComparator;
import edu.cvtc.web.dao.AccountDao;
import edu.cvtc.web.dao.impl.AccountDaoImpl;
import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;
import edu.cvtc.web.predicates.MatchesAccountMailingAddressPredicate;
import edu.cvtc.web.predicates.MatchesAccountNamePredicate;
import edu.cvtc.web.predicates.MatchesAccountNumberPredicate;
import edu.cvtc.web.predicates.MatchesAccountPhoneNumberPredicate;
import edu.cvtc.web.predicates.MatchesAccountPredicate;
import edu.cvtc.web.predicates.MatchesCVVNumberPredicate;
import edu.cvtc.web.predicates.MatchesCardNumberPredicate;
import edu.cvtc.web.predicates.MatchesEmailAddressPredicate;
import edu.cvtc.web.predicates.MatchesExpirationDatePredicate;
import edu.cvtc.web.predicates.MatchesNotesPredicate;
import edu.cvtc.web.predicates.MatchesPasswordPredicate;
import edu.cvtc.web.predicates.MatchesRoutingNumberPredicate;
import edu.cvtc.web.predicates.MatchesSecretAnswerPredicate;
import edu.cvtc.web.predicates.MatchesSecretQuestionPredicate;
import edu.cvtc.web.predicates.MatchesStorageSizePredicate;
import edu.cvtc.web.predicates.MatchesUrlPredicate;
import edu.cvtc.web.predicates.MatchesUserNamePredicate;
import edu.cvtc.web.search.AccountSearch;

/**
 * @author ChaseLukeA
 *
 */
public class AccountSearchImpl implements AccountSearch {

	private AccountDao accountDao = new AccountDaoImpl();
	
	@Override
	public List<Account> retrieveAccounts(String sortType)
			throws AccountManagerException {
		try {
			final List<Account> accounts = accountDao.retrieveAccountsFromDatabase();
			if (null != sortType) {
				sortAccounts(accounts, sortType);
			}
			return accounts;
		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("List of accounts could not be retrieved from the database.");
		}
	}
	
	private void sortAccounts(final List<Account> accounts, final String sortType) {
		switch (sortType) {
		case "accountName":
			Collections.sort(accounts, new AccountNameComparator());
			break;
		case "url":
			Collections.sort(accounts, new UrlComparator());
			break;
		case "emailAddress":
			Collections.sort(accounts, new EmailAddressComparator());
			break;
		case "userName":
			Collections.sort(accounts, new UserNameComparator());
			break;
		case "password":
			Collections.sort(accounts, new PasswordComparator());
			break;
		case "notes":
			Collections.sort(accounts, new NotesComparator());
			break;
		case "storageSize":
			Collections.sort(accounts, new StorageSizeComparator());
			break;
		case "accountNumber":
			Collections.sort(accounts, new AccountNumberComparator());
			break;
		case "routingNumber":
			Collections.sort(accounts, new RoutingNumberComparator());
			break;
		case "cardNumber":
			Collections.sort(accounts, new CardNumberComparator());
			break;
		case "expirationDate":
			Collections.sort(accounts, new ExpirationDateComparator());
			break;
		case "cvvNumber":
			Collections.sort(accounts, new CVVNumberComparator());
			break;
		case "accountMailingAddress":
			Collections.sort(accounts, new AccountMailingAddressComparator());
			break;
		case "accountPhoneNumber":
			Collections.sort(accounts, new AccountPhoneNumberComparator());
			break;
		case "secretQuestion":
			Collections.sort(accounts, new SecretQuestionComparator());
			break;
		case "secretAnswer":
			Collections.sort(accounts, new SecretAnswerComparator());
			break;
		default:
			break;
		}
	}
	
	@Override
	public List<Account> findAccount(String searchType, String searchTerm)
			throws AccountManagerException {
		try {
			final List<Account> accounts = accountDao.retrieveAccountsFromDatabase();
			switch (searchType) {
			case "accountName":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesAccountNamePredicate(searchTerm)));
			case "url":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesUrlPredicate(searchTerm)));
			case "emailAddress":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesEmailAddressPredicate(searchTerm)));
			case "userName":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesUserNamePredicate(searchTerm)));
			case "password":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesPasswordPredicate(searchTerm)));
			case "notes":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesNotesPredicate(searchTerm)));
			case "storageSize":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesStorageSizePredicate(searchTerm)));
			case "accountNumber":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesAccountNumberPredicate(searchTerm)));
			case "routingNumber":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesRoutingNumberPredicate(searchTerm)));
			case "cardNumber":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesCardNumberPredicate(searchTerm)));
			case "expirationDate":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesExpirationDatePredicate(searchTerm)));
			case "cvvNumber":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesCVVNumberPredicate(searchTerm)));
			case "accountMailingAddress":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesAccountMailingAddressPredicate(searchTerm)));
			case "accountPhoneNumber":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesAccountPhoneNumberPredicate(searchTerm)));
			case "secretQuestion":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesSecretQuestionPredicate(searchTerm)));
			case "secretAnswer":
				return Lists.newArrayList(Collections2.filter(accounts, new MatchesSecretAnswerPredicate(searchTerm)));
			default:  // case "searchAll"
				break;
			}

			// to avoid "must return something" error Eclipse gives, the default case exits the switch and
			// "searchAll" is the type of search automatically returned
			return Lists.newArrayList(Collections2.filter(accounts, new MatchesAccountPredicate(searchTerm)));

		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("Could not find an account containing that search term.");
		}

	}

	@Override
	public List<Account> findAccountSortedBy(String searchType,
			String searchTerm, String sortType) throws AccountManagerException {
		
			final List<Account> accounts = findAccount(searchType, searchTerm);

			if (null != sortType) {
				sortAccounts(accounts, sortType);
			}

			return accounts;	

	}

}
