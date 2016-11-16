package dao;

import java.util.List;
import java.util.Set;

import domain.Adresse;
import domain.Contact;
import domain.ContactGroupe;
import domain.Telephone;

public interface IDAOContact {
	public Adresse createAdresse(Adresse adresse);
	public ContactGroupe createContactGroupe(ContactGroupe contactGroupe);
	public Telephone createTelephone(Telephone tel);

    //CONTACT
	public Contact createContact(Contact contact);
	public Contact deleteContact(long idContact);
	public Contact updateContact(long idContact, String nom, String prenom, String email);
	public Contact findContactById(long id);
	public List findContactByLastName(String lastname);
	public List<Contact> findContactByEmail(String email);
	public List<Contact> getAllContacts();
	void rechercheContact(long idContact);
	void hello();
}
