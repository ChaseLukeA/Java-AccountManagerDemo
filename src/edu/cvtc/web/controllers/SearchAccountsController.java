package edu.cvtc.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Strings;

import edu.cvtc.web.exception.AccountManagerException;
import edu.cvtc.web.model.Account;
import edu.cvtc.web.search.AccountSearch;
import edu.cvtc.web.search.impl.AccountSearchImpl;

/**
 * Servlet implementation class SearchAccountsController
 */
@WebServlet("/SearchAccounts")
public class SearchAccountsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target = null;
		
		try {
			final String searchType = request.getParameter("searchType");
			final String searchTerm = request.getParameter("searchTerm");
			final String sortType = request.getParameter("sortType");
			
			if (!Strings.isNullOrEmpty(searchTerm)) {
				
				final AccountSearch accountSearch = new AccountSearchImpl();
				final List<Account> accounts;
				
				if (null != sortType) {
					accounts = accountSearch.findAccountSortedBy(searchType, searchTerm, sortType);
				} else {
					accounts = accountSearch.findAccount(searchType, searchTerm);
				}
				request.setAttribute("accounts", accounts);
				request.setAttribute("pageTitle", "Account Manager - Search Results");
				request.setAttribute("headerTitle", "Search Results");
				request.setAttribute("headerDetails", "for <em>\"" + searchTerm + "\"</em> in <em>" + Account.longName(searchType) + "</em> sorted by <em>" + Account.longName(sortType) + "</em>");
				
				target = "results.jsp";

			} else {
				request.setAttribute("error", "You must enter something to search for!");
				target = "error.jsp";
			}
			
		} catch (AccountManagerException e) {
			e.printStackTrace();
			request.setAttribute("error", "Sorry, there was a problem searching for an account in the database.");
			target = "error.jsp";
		}
				
		request.getRequestDispatcher(target).forward(request, response);
		
	}

}
