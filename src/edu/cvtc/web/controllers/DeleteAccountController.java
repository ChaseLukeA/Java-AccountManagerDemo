package edu.cvtc.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.AccountDao;
import edu.cvtc.web.dao.impl.AccountDaoImpl;
import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;

/**
 * Servlet implementation class DeleteAccountController
 */
@WebServlet("/DeleteAccount")
public class DeleteAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AccountDao accountDao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		try {

			final int accountId = Integer.parseInt(request.getParameter("accountId"));

			final Account account = new Account(accountId, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null); 
			
			getAccountDao().deleteAccount(account);
			
			request.setAttribute("success", "Success, the account has been deleted from the database.");
			target = "success.jsp";

		} catch (AccountManagerException e) {
			e.printStackTrace();
			request.setAttribute("error", "Sorry, there was a problem deleting this account from the database.");
			target = "error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);
		
	}

	public AccountDao getAccountDao() {
		if (null == accountDao) {
			accountDao = new AccountDaoImpl();
		}
		return accountDao;
	}

}
