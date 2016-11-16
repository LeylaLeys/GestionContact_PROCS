package servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.ContactDao;
import dao.IDAOContact;
import domain.Adresse;
import domain.Contact;
import domain.ContactBean;
import domain.ContactGroupe;
import domain.Entreprise;
import domain.Telephone;
import services.ContactService;

/**
 * Servlet implementation class CreerContactServlet
 */
public class CreerContactServlet extends HttpServlet {
	/*private static final long serialVersionUID = 1L;
	  private static final long id = 0;
      */ 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Set<ContactGroupe> groupes = new HashSet<ContactGroupe>();
		Set<Contact> contacts = new HashSet<Contact>();
		Set<Telephone> tels = new HashSet<Telephone>();
		
		ContactGroupe contactGroupe = new ContactGroupe();
		contactGroupe.setNomGroupe(request.getParameter("nomGroupe"));
		
		groupes.add(contactGroupe);
		
		Contact contact = new Contact();
		contact.setNom(request.getParameter("nom"));
		contact.setPrenom(request.getParameter("prenom"));
		contact.setEmail(request.getParameter("email"));
		
		Adresse adresse = new Adresse();
		adresse.setCodePostal(request.getParameter("codePostal"));
		adresse.setPays(request.getParameter("pays"));
		adresse.setRue(request.getParameter("rue"));
		adresse.setVille(request.getParameter("ville"));
		contact.setAdresse(adresse);
		
		Telephone tel = new Telephone();
		tel.setTelBureau( request.getParameter("telBureau"));
		tel.setTelMobile( request.getParameter("telMobile"));
		tel.setTelMaison( request.getParameter("telMaison"));
		tels.add(tel);
		contact.setTels(tels);
		
		
		Entreprise entp = new Entreprise();
		entp.setNumSiret(request.getParameter("numSiret"));
		
		contacts.add(contact);
		contactGroupe.setContacts(contacts);
		contact.setContactGroupes(groupes);
				
		System.out.println("tentative de creation de contact");
		System.out.println("Nom :" + request.getParameter("nom") + " Prénom : " + request.getParameter("prenom") + " Email : " + request.getParameter("email"));
		System.out.println("Rue : " + request.getParameter("rue") + " Ville : " + request.getParameter("ville") + " Code Postal : " + request.getParameter("codePostal") + " Pays :" + request.getParameter("pays"));
		System.out.println("Nom du groupe : " + request.getParameter("nomGroupe"));
		System.out.println("telBureau : " + request.getParameter("telBureau") + " telMaison : " + request.getParameter("telMaison") + " telMobile : " + request.getParameter("telMobile") );
		System.out.println("Statut Employé / Entreprise" );
		System.out.println("Num de Siret: " + request.getParameter("numSiret"));
		
		
		ContactService cs = new ContactService();
		cs.creerContactService(contact, adresse, contactGroupe, tel);*/
		
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		/*Contact contact = (Contact)context.getBean("beanContact1");
		Adresse adresse = (Adresse)context.getBean("beanAdresse1");
		Telephone telephone = (Telephone)context.getBean("beanTelephone1");
		ContactGroupe contactGroupe = (ContactGroupe)context.getBean("beanGroupe1");*/
		
		ContactBean contactBean = (ContactBean)context.getBean("beanContactBean");
		
		Contact contact2 = (Contact)context.getBean("beanContact2");
		Adresse adresse2 = (Adresse)context.getBean("beanAdresse2");
		Telephone telephone2 = (Telephone)context.getBean("beanTelephone2");
		ContactGroupe contactGroupe2 = (ContactGroupe)context.getBean("beanGroupe2");
		
		ContactService cs = new ContactService();
		//cs.creerContactBean(contact,adresse,telephone,contactGroupe);
		cs.creerContactBean(contact2,adresse2,telephone2,contactGroupe2);
		cs.creerContactBean(contactBean.getBeanContact1(), contactBean.getBeanAdresse1(), contactBean.getBeanTelephone1(), contactBean.getBeanGroupe1());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
		rd.forward(request, response);
	}

}
