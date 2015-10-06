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
 * Servlet implementation class UpdateAccountController
 */
@WebServlet("/UpdateAccount")
public class UpdateAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AccountDao accountDao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		try {

			final String accountName = request.getParameter("accountName");
			final String url = request.getParameter("url");
			final String emailAddress = request.getParameter("emailAddress");
			final String userName = request.getParameter("userName");
			final String password = request.getParameter("password");
			final String notes = request.getParameter("notes");
			final String storageSize = request.getParameter("storageSize");
			final String accountNumber = request.getParameter("accountNumber");
			final String routingNumber = request.getParameter("routingNumber");
			final String cardNumber = request.getParameter("cardNumber");
			final String expirationDate = request.getParameter("expirationDate");
			final String cvvNumber = request.getParameter("cvvNumber");
			final String accountMailingAddress = request.getParameter("accountMailingAddress");
			final String accountPhoneNumber = request.getParameter("accountPhoneNumber");
			final String secretQuestion = request.getParameter("secretQuestion");
			final String secretAnswer = request.getParameter("secretAnswer");
			final int accountId = Integer.parseInt(request.getParameter("accountId"));
			
			final Account account = new Account(accountId, accountName, url, emailAddress, userName, password, notes, storageSize, accountNumber, routingNumber, cardNumber, expirationDate, cvvNumber, accountMailingAddress, accountPhoneNumber, secretQuestion, secretAnswer);
			
			getAccountDao().updateAccount(account);
			
			request.setAttribute("success", "Success, the Account has been updated in the database.");
			target = "success.jsp";

		} catch (AccountManagerException e) {
			e.printStackTrace();
			request.setAttribute("error", "Sorry, there was a problem updating this Account in the database.");
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
