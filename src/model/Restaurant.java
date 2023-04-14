package model;

public class Restaurant extends CentraleReservation{
	private EntiteReservable[] tableauEntite;
	private int numEntite;
	public Restaurant() {
		super(tableauEntite,numEntite);
	}
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		super.ajouterEntite(table);
	}
	public int[] donnerPossibilitees(FormulaireRestaurant formulaireRestaurant) {
		return super.donnerPossibilites(formulaireRestaurant);
	}
	public Reservation reserver(int numEntite,FormulaireRestaurant formulaireRestaurant) {
		return super.reserver(numEntite, formulaireRestaurant);
	}
	public class Table extends EntiteReservable{
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;
		public Table(int nbChaises) {
			this.nbChaises=nbChaises;
		}
		public ReservationRestaurant reserver(FormulaireRestaurant formulaireRestaurant) {
			ReservationRestaurant reservation = null;
			if (this.compatible(formulaireRestaurant)) {
				if (formulaireRestaurant.getNumService()==1) {
					if (super.calendrierPerso.reserver(formulaireRestaurant.getJour(),formulaireRestaurant.getMois())){
						reservation = new ReservationRestaurant(formulaireRestaurant.getJour(), formulaireRestaurant.getMois(), formulaireRestaurant.getNumService(), formulaireRestaurant.getIdentificationEntite());
					}
				}else {
					if (calendrierDeuxiemeService.reserver(formulaireRestaurant.getJour(),formulaireRestaurant.getMois())) {
						reservation = new ReservationRestaurant(formulaireRestaurant.getJour(), formulaireRestaurant.getMois(), formulaireRestaurant.getNumService(), formulaireRestaurant.getIdentificationEntite());
					}
				}
			}
			return reservation;
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
