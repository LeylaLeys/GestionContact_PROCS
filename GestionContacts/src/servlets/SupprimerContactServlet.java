package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Adresse;
import domain.Contact;
import domain.ContactGroupe;
import domain.Telephone;
import services.ContactService;

/**
 * Servlet implementation class SupprimerContactServlet
 */
public class SupprimerContactServlet extends HttpServlet {
	/*
	 * private static final long serialVersionUID = 1L; private static final
	 * long id = 0;
	 */

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SupprimerContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ici j'appelle je"load" comment ? sachant que j'ai deja un
		// session.load dans le dao

		long idContact = Long.valueOf(request.getParameter("idContact"));

		ContactService cs = new ContactService();
		cs.suppContactService(idContact);

		RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
		rd.forward(request, response);
	}

}
