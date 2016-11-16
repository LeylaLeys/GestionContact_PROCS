package domain;

public class Entreprise extends Contact {

	String numSiret;

	public Entreprise(String numSiret) {
		super();
		this.numSiret = numSiret;
	}

	public Entreprise() {
		super();
	}

	public String getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(String string) {
		this.numSiret = string;
	}
	
	
}
