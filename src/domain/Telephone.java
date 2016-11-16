package domain;

public class Telephone {

	long idTel;
	String telMaison;
	String telMobile;
	String telBureau;
	Contact contact;
	
	public Telephone() {
	}

	public long getIdTel() {
		return idTel;
	}

	public void setIdTel(long idTel) {
		this.idTel = idTel;
	}

	public String getTelMaison() {
		return telMaison;
	}

	public void setTelMaison(String telMaison) {
		this.telMaison = telMaison;
	}

	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public String getTelBureau() {
		return telBureau;
	}

	public void setTelBureau(String telBureau) {
		this.telBureau = telBureau;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
}
