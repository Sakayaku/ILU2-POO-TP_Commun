package model;

public abstract class EntiteReservable<F extends Formulaire>{
	protected CalendrierAnnuel calendrierPerso;
	private int numero;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean estLibre(F formulaire) {
		return (calendrierPerso.estLibre(formulaire.getJour(),formulaire.getMois())); 
	}
	public abstract boolean compatible(F formulaire);
	public abstract Reservation reserver(F formulaire);
}
