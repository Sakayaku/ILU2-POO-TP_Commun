package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.numService=numService;
		this.numTable=numTable;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("table n°").append(numTable).append(" pour le ");
		if (numService==1) {
			sb.append("premier service.\n");
		}else {
			sb.append("deuxième service.\n");
		}
		return sb.toString();
	}
}
