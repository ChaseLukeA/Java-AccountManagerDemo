/**
 * 
 */
package edu.cvtc.web.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author ChaseLukeA
 *
 */
public class DBUtility {
	
	public static final int TIMEOUT = 30;
	public static final String CONNECTION = "jdbc:sqlite:/Users/ChaseLukeA/accounts.sqlite";

	// For future implementation where the table changes based on the logged-in user
	public static final String TABLE_NAME = "account";

	private static final String DRIVER_NAME = "org.sqlite.JDBC";
	
	public static Connection createConnection(final String connection) throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER_NAME);
		
		return DriverManager.getConnection(connection);
		
	}
	
	public static void closeConnection(final Connection connection, final Statement statement) {
		
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}

	}

}
