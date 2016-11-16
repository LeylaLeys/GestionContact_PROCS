package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.Adresse;
import domain.Contact;
import domain.ContactGroupe;
import domain.Telephone;
import util.HibernateUtil;

public class TelephoneDao implements IDAOContact {
	@Override
	public Telephone createTelephone(Telephone tel) {
		Telephone createdTelephone = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(tel);
			transaction.commit();
			createdTelephone = (Telephone) session.load(Telephone.class, tel.getIdTel());
			System.out.println("Telephone crée ! ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}
		return createdTelephone;

	}

	@Override
	public Contact createContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse createAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact deleteContact(long idContact) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Contact findContactById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactGroupe createContactGroupe(ContactGroupe contactGroupe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findContactByLastName(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findContactByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(long idContact, String nom, String prenom, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void rechercheContact(long idContact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}
}
