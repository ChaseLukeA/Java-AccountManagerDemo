/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.cvtc.web.dao.AccountDao;
import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;
import edu.cvtc.web.utilities.DBUtility;

/**
 * @author ChaseLukeA
 *
 */
public class AccountDaoImpl implements AccountDao {
	private static final String RETRIEVE_ALL_ACCOUNTS = "select * from " + DBUtility.TABLE_NAME + ";";

	@Override
	public List<Account> retrieveAccountsFromDatabase()
			throws AccountManagerException {
		
		List<Account> accounts = new ArrayList<Account>();
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = DBUtility.createConnection(DBUtility.CONNECTION);
			statement = connection.createStatement();
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			ResultSet resultSet = statement.executeQuery(RETRIEVE_ALL_ACCOUNTS);
			
			while (resultSet.next()) {
				
				int accountId = resultSet.getInt("accountId");
				String accountName = resultSet.getString("accountName");
				String url = resultSet.getString("url");
				String emailAddress = resultSet.getString("emailAddress");
				String userName = resultSet.getString("userName");
				String password = resultSet.getString("password");
				String notes = resultSet.getString("notes");
				String storageSize = resultSet.getString("storageSize");
				String accountNumber = resultSet.getString("accountNumber");
				String routingNumber = resultSet.getString("routingNumber");
				String cardNumber = resultSet.getString("cardNumber");
				String expirationDate = resultSet.getString("expirationDate");
				String cvvNumber = resultSet.getString("cvvNumber");
				String accountMailingAddress = resultSet.getString("accountMailingAddress");
				String accountPhoneNumber = resultSet.getString("accountPhoneNumber");
				String secretQuestion = resultSet.getString("secretQuestion");
				String secretAnswer = resultSet.getString("secretAnswer");
				
				Account account = new Account(accountId, accountName, url, emailAddress, userName, password, notes, storageSize, accountNumber, routingNumber, cardNumber, expirationDate, cvvNumber, accountMailingAddress, accountPhoneNumber, secretQuestion, secretAnswer);

				accounts.add(account);

			}
			
			resultSet.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("Error retrieving accounts from the database.");
		} finally {
			DBUtility.closeConnection(connection, statement);
		}
		
		return accounts;

	}

	@Override
	public Integer insertAccount(Account account)
			throws AccountManagerException {
		
		Connection connection = null;
		PreparedStatement insertStatement = null;
		
		try {
			connection = DBUtility.createConnection(DBUtility.CONNECTION);
			final String insert = "insert into " + DBUtility.TABLE_NAME + " (accountName, url, emailAddress, userName, password, notes, storageSize, accountNumber, routingNumber, cardNumber, expirationDate, cvvNumber, accountMailingAddress, accountPhoneNumber, secretQuestion, secretAnswer) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			insertStatement = connection.prepareStatement(insert);
			
			insertStatement.setString(1, account.getAccountName());
			insertStatement.setString(2, account.getUrl());
			insertStatement.setString(3, account.getEmailAddress());
			insertStatement.setString(4, account.getUserName());
			insertStatement.setString(5, account.getPassword());
			insertStatement.setString(6, account.getNotes());
			insertStatement.setString(7, account.getStorageSize());
			insertStatement.setString(8, account.getAccountNumber());
			insertStatement.setString(9, account.getRoutingNumber());
			insertStatement.setString(10, account.getCardNumber());
			insertStatement.setString(11, account.getExpirationDate());
			insertStatement.setString(12, account.getCvvNumber());
			insertStatement.setString(13, account.getAccountMailingAddress());
			insertStatement.setString(14, account.getAccountPhoneNumber());
			insertStatement.setString(15, account.getSecretQuestion());
			insertStatement.setString(16, account.getSecretAnswer());

			insertStatement.setQueryTimeout(30);

			return insertStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("Error inserting account into the database.");
		} finally {
			DBUtility.closeConnection(connection, insertStatement);
		}
		
	}

	@Override
	public Integer updateAccount(Account account)
			throws AccountManagerException {
		
		Connection connection = null;
		PreparedStatement updateStatement = null;
		
		try {
			connection = DBUtility.createConnection(DBUtility.CONNECTION);
			// did update query with key=? instead of key, key (?, ?) because using that format with
			// prepared statement was not working correctly and giving sql errors; this way works perfectly
			final String update = "update " + DBUtility.TABLE_NAME + " set accountName=?, url=?, emailAddress=?, userName=?, password=?, notes=?, storageSize=?, accountNumber=?, routingNumber=?, cardNumber=?, expirationDate=?, cvvNumber=?, accountMailingAddress=?, accountPhoneNumber=?, secretQuestion=?, secretAnswer=? where accountId=" + account.getAccountId();
			updateStatement = connection.prepareStatement(update);
			
			updateStatement.setString(1, account.getAccountName());
			updateStatement.setString(2, account.getUrl());
			updateStatement.setString(3, account.getEmailAddress());
			updateStatement.setString(4, account.getUserName());
			updateStatement.setString(5, account.getPassword());
			updateStatement.setString(6, account.getNotes());
			updateStatement.setString(7, account.getStorageSize());
			updateStatement.setString(8, account.getAccountNumber());
			updateStatement.setString(9, account.getRoutingNumber());
			updateStatement.setString(10, account.getCardNumber());
			updateStatement.setString(11, account.getExpirationDate());
			updateStatement.setString(12, account.getCvvNumber());
			updateStatement.setString(13, account.getAccountMailingAddress());
			updateStatement.setString(14, account.getAccountPhoneNumber());
			updateStatement.setString(15, account.getSecretQuestion());
			updateStatement.setString(16, account.getSecretAnswer());

			updateStatement.setQueryTimeout(DBUtility.TIMEOUT);

			return updateStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("Error updating account in the database.");
		} finally {
			DBUtility.closeConnection(connection, updateStatement);
		}

	}

	@Override
	public Integer deleteAccount(Account account)
			throws AccountManagerException {

		Connection connection = null;
		PreparedStatement deleteStatement = null;
		
		try {
			connection = DBUtility.createConnection(DBUtility.CONNECTION);
			final String delete = "delete from " + DBUtility.TABLE_NAME + " where accountId = " + account.getAccountId();
			deleteStatement = connection.prepareStatement(delete);
			
			deleteStatement.setQueryTimeout(DBUtility.TIMEOUT);

			return deleteStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw new AccountManagerException("Error deleting acocunt from the database.");
		} finally {
			DBUtility.closeConnection(connection, deleteStatement);
		}

	}
	
}