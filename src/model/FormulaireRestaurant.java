package model;

public class FormulaireRestaurant extends Formulaire{
	private int nombrePersonnes;
	private int numService;
	private int identificationEntite;
	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
		super(jour,mois);
	}
	public int getNombrePersonnes() {
		return nombrePersonnes;
	}
	public void setNombrePersonnes(int nombrePersonnes) {
		this.nombrePersonnes = nombrePersonnes;
	}
	public int getNumService() {
		return numService;
	}
	public void setNumService(int numService) {
		this.numService = numService;
	}
	public int getIdentificationEntite() {
		return identificationEntite;
	}
	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}
	public int getJour() {
		return this.jour;
	}
	public int getMois() {
		return this.mois;
	}
	
}
