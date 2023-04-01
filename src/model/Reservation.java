package model;

public abstract class Reservation {
	protected int mois;
	protected int jour;
	protected Reservation (int jour, int mois) {
		this.jour=jour;
		this.mois=mois;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le ").append(jour).append("/").append(mois).append(" : ");
		return sb.toString();
	}
}
