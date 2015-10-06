package edu.cvtc.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;
import edu.cvtc.web.search.AccountSearch;
import edu.cvtc.web.search.impl.AccountSearchImpl;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/ViewAll")
public class ResultsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		try {
			final AccountSearch accountSearch = new AccountSearchImpl();
			final String sortType = request.getParameter("sort");
			List<Account> accounts = accountSearch.retrieveAccounts(sortType);

			request.setAttribute("accounts", accounts);
			request.setAttribute("pageTitle", "Account Manager - All Accounts");
			request.setAttribute("headerTitle", "All Accounts");
			if (null != sortType) {
				request.setAttribute("headerDetails", "sorted by <em>" + Account.longName(sortType) + "</em>");
			} else {
				request.setAttribute("headerDetails", "<em>Unsorted</em>");
			}
			target = "results.jsp";
			
		} catch (AccountManagerException e) {
			e.printStackTrace();
			request.setAttribute("error", "Sorry, we were unable to complete your request.");
			target = "error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);
		
	}

}