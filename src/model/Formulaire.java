package model;

public abstract class Formulaire {
	protected int mois;
	protected int jour;
	protected int numeroEntite;
	protected Formulaire (int jour, int mois) {
		this.jour=jour;
		this.mois=mois;
	}
	public int getJour() {
		return this.jour;
	}
	public int getMois() {
		return this.mois;
	}
	public int getNumeroEntite() {
		return numeroEntite;
	}
	public void setNumeroEntite(int numeroEntite) {
		this.numeroEntite = numeroEntite;
	}
	
}
