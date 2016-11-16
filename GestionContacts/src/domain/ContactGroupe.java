package domain;

import java.util.HashSet;
import java.util.Set;

public class ContactGroupe {

	long idGroupe;
	String nomGroupe;
	Set<Contact> contacts = new HashSet<>();
	
	public ContactGroupe(){
		
	}
	
	public ContactGroupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}
	public long getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(long idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
