package model;

public class ReservationHotel extends Reservation{
	private int numLSimple;
	private int numLDouble;
	private int numChambre;
	public ReservationHotel(int jour, int mois, int numLSimple, int numLDouble, int numChambre) {
			super(jour,mois);
			this.numLSimple=numLSimple;
			this.numLDouble=numLDouble;
			this.numChambre=numChambre;
		}	
}
