package model;

public class CentraleReservation <E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] tableauEntite;
	private int nombreEntite;
	public CentraleReservation(E[] tableauEntite, int numEntite) {
		this.tableauEntite=tableauEntite;
		this.nombreEntite=numEntite;
	}
	public int ajouterEntite(E entite) {
		for (int i=0;i<tableauEntite.length;i++) {
			if(tableauEntite[i]==null) {
				tableauEntite[i]=entite;
			}
		}
		nombreEntite+=1;
		return nombreEntite;
	}
	public int[] donnerPossibilites(F formulaire) {
		int[] resultat=new int[nombreEntite]; 
		for (int i=0;i<tableauEntite.length;i++) {
			if (tableauEntite[i].compatible(formulaire)) {
				resultat[i]=tableauEntite[i].getNumero();
			}else {
				resultat[i]=0;
			}
		}
		return resultat;
	}
	public Reservation reserver(int numEntite, F formulaire) {
		formulaire.setNumeroEntite(numEntite);
		return tableauEntite[numEntite].reserver(formulaire);
	}
}
