package model;

public class Restaurant {
	public class Table extends EntiteReservable{
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;
		public Table(int nbChaises) {
			this.nbChaises=nbChaises;
		}
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			if (formulaireRestaurant.getNumService()==1) {
				calendrierPerso
			}else {
				
			}
		}
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			if (nbChaises==formulaireRestaurant.getNombrePersonnes() || nbChaises==formulaireRestaurant.getNombrePersonnes()+1) {
				if (this.estLibre(formulaireRestaurant)) {
					return true;
				}
			}
			return false;
		}
	}
}
