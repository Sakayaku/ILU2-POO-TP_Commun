package model;

public abstract class Reservation {
	public int mois;
	public int jour;
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le ").append(jour).append("/").append(mois).append(": ");
		return sb.toString();
	}
}
