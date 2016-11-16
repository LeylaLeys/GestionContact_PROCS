package domain;

public class ContactBean {
	
	private Contact beanContact1;
	private Adresse beanAdresse1;
	private Telephone beanTelephone1;
	private ContactGroupe beanGroupe1;
	private int i;
	public ContactBean(Contact beanContact1, Adresse beanAdresse1, Telephone beanTelephone1, ContactGroupe beanGroupe1, int i) {
		this.beanContact1 = beanContact1;
		this.beanAdresse1 = beanAdresse1;
		this.beanTelephone1 = beanTelephone1;
		this.beanGroupe1 = beanGroupe1;
		this.i = i;
	}
	public Contact getBeanContact1() {
		return beanContact1;
	}
	public void setBeanContact1(Contact beanContact1) {
		this.beanContact1 = beanContact1;
	}
	public Adresse getBeanAdresse1() {
		return beanAdresse1;
	}
	public void setBeanAdresse1(Adresse beanAdresse1) {
		this.beanAdresse1 = beanAdresse1;
	}
	public Telephone getBeanTelephone1() {
		return beanTelephone1;
	}
	public void setBeanTelephone1(Telephone beanTelephone1) {
		this.beanTelephone1 = beanTelephone1;
	}
	public ContactGroupe getBeanGroupe1() {
		return beanGroupe1;
	}
	public void setBeanGroupe1(ContactGroupe beanGroupe1) {
		this.beanGroupe1 = beanGroupe1;
	}
	
	
}
