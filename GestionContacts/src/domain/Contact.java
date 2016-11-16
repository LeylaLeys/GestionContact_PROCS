package domain;

import java.util.HashSet;
import java.util.Set;

public class Contact {
	String nom;
	String prenom;
	String email;
	long idContact;
		
	Adresse adresse;
	Set<ContactGroupe> contactGroupes = new HashSet<>();
	Set<Telephone> tels = new HashSet<>();
	
	private int vers;
	
	public Contact(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	public Contact() {
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getIdContact() {
		return idContact;
	}
	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}
	public Set<ContactGroupe> getContactGroupes() {
		return contactGroupes;
	}
	public void setContactGroupes(Set<ContactGroupe> contactGroupes) {
		this.contactGroupes = contactGroupes;
	}
	public Set<Telephone> getTels() {
		return tels;
	}

	public void setTels(Set<Telephone> tels) {
		// TODO Auto-generated method stub
	}
	
	
	public int getVers() {
		return vers;
	}
	public void setVers(int vers) {
		this.vers = vers;
	}
	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", idContact=" + idContact
				+ ", adresse=" + adresse + ", contactGroupes=" + contactGroupes + ", tels=" + tels + "]";
	}
	
}
