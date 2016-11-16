package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import domain.Adresse;
import domain.Contact;
import domain.ContactGroupe;
import domain.Telephone;
import util.HibernateUtil;

public class ContactDao implements IDAOContact {

	// CREE UN CONTACT
	@Override
	public Contact createContact(Contact contact) {
		Contact createdContact = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(contact);
			transaction.commit();
			createdContact = (Contact) session.load(Contact.class, contact.getIdContact());
			System.out.println("Contact crée ! ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}
		return createdContact;

	}

	// SUPPRIME UN CONTACT- REQUETE PARAMETREE EN HQL
	public Contact deleteContact(long idContact) {
		Session session = null;
		Transaction t = null;
		try {
			
			Contact contact = findContactById(idContact);
			
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			t = session.beginTransaction();
			Query req = session.createQuery("delete from Contact");
			req.executeUpdate();
			System.out.println("Person deleted successfully, contact details=" + contact);
			t.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	// UPDATE UN CONTACT
	
	public Contact updateContact(long idContact, String nom, String prenom, String email) {
		Session session = null;
		Transaction t = null;
		Contact contact;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			
			contact = findContactById(idContact);
			
			contact.setNom(nom);
			contact.setPrenom(prenom);
			contact.setEmail(email);
			
			System.out.println("Nom : "+contact.getNom()+" Prénom : "+contact.getPrenom()+" Email : "+contact.getEmail());
			
			session.update(contact);
			t.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	
		
		return null;
	}

	// READ CONTACT - REQUETE PARAMETREE EN HQL
	@Override
	public List getAllContacts() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction(); // avant toute opération dans la bdd
		Query req = session.createQuery("select from Contact");
		List list_contacts = req.list();
		session.getTransaction().commit();
		session.close();
		return list_contacts;
	}

	// RECHERCHE
	@Override
	public Contact findContactById(long idContact) {
		Session session =null;
		Contact c = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction(); // avant toute opération dans la bdd
			
			c = (Contact) session.get(Contact.class, idContact);
			//t.commit();
			
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
		
		return c;
		
	}
	
	@Override
	public void rechercheContact(long idContact){
		Session session =null;
		Contact c = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction(); // avant toute opération dans la bdd
			
			List<Long> contact = session.createCriteria(domain.Contact.class).
	        		add(Restrictions.eq("idContact",idContact)).
	        		list();
			//t.commit();
			
			System.out.println("Contact :"+contact);
			
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}	
	}

	@Override
	public List findContactByLastName(String lastname) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction(); // avant toute opération dans la bdd
		Query req = session.createQuery("select contact from Contact where contact.lastname like :x");
		req.setParameter("x","%" + lastname+"%");
		List list_contacts_by_lastname = req.list();
		session.getTransaction().commit();
		session.close();
		return list_contacts_by_lastname;
	}

	@Override
	public List <Contact> findContactByEmail(String email) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction(); // avant toute opération dans la bdd
		Query req = session.createQuery("select contact from Contact where contact.email like :x");
		req.setParameter("x","%" + email+ "%");
		List list_contacts_by_email = req.list();
		session.getTransaction().commit();
		session.close();
		return list_contacts_by_email;
		}

	@Override
	public Adresse createAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactGroupe createContactGroupe(ContactGroupe contactGroupe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Telephone createTelephone(Telephone tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hello(){
		System.out.println("Hello Word");
	}
	
}
