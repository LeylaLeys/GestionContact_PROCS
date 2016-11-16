package services;

import org.apache.catalina.connector.Request;

import dao.AdresseDao;
import dao.ContactDao;
import dao.ContactGroupeDao;
import dao.TelephoneDao;
import domain.Adresse;
import domain.Contact;
import domain.ContactGroupe;
import domain.Telephone;

public class ContactService {
	
		
		private Object findContactById(long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		

		public void creerContactService(Contact contact, Adresse adresse, ContactGroupe contactGroupe, Telephone tel) {
			//Faire appel au DAO
			ContactDao daoContact = new ContactDao();
			AdresseDao daoAdresse = new AdresseDao();
			TelephoneDao daoTel = new TelephoneDao();
			ContactGroupeDao daoContactGroupe = new ContactGroupeDao();
			
			//Créer le contact
			ContactGroupe contactGroupeCreated = daoContactGroupe.createContactGroupe(contactGroupe);
			Adresse adresseCreated = daoAdresse.createAdresse(adresse);
			Telephone telCreated = daoTel.createTelephone(tel);
			Contact contactCreated = daoContact.createContact(contact);
			
		}
		
		
		public void suppContactService(long idContact){
			ContactDao daoContact = new ContactDao();
			Contact contactToDelete = daoContact.deleteContact(idContact);
			
		}
		
		public void modifContactService(long idContact, String nom, String prenom, String email){
			//Faire appel au DAO
			ContactDao daoContact = new ContactDao();		
			//UPDATE
			daoContact.updateContact(idContact, nom,  prenom,  email);
		
		}
		
		public void rechercheContactService(long idContact){
			ContactDao daoContact = new ContactDao();
			daoContact.rechercheContact(idContact);
		}
		
		public void creerContactBean(Contact contact, Adresse adresse, Telephone telephone, ContactGroupe contactGroupe){
			ContactDao daoContact = new ContactDao();
			AdresseDao daoAdresse = new AdresseDao();
			TelephoneDao daoTel = new TelephoneDao();
			ContactGroupeDao daoContactGroupe = new ContactGroupeDao();
			
			
			Adresse adresseCreated = daoAdresse.createAdresse(adresse);
			ContactGroupe contactGroupeCreated = daoContactGroupe.createContactGroupe(contactGroupe);
			Contact contactCreated = daoContact.createContact(contact);
			Telephone telCreated = daoTel.createTelephone(telephone);
		}



		


		

		
	
}
