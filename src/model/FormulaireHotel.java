package model;

public class FormulaireHotel extends Formulaire {
	private int numEntite;
	private int numLSimple;
	private int numLDouble;
	private int numChambre;
	public FormulaireHotel(int jour, int mois, int numLSimple, int numLDouble, int numChambre) {
		super(jour,mois);
		this.numLSimple=numLSimple;
		this.numLDouble=numLDouble;
		this.numChambre=numChambre;
	}
	public int getNumEntite() {
		return numEntite;
	}
	public void setNumEntite(int numEntite) {
		this.numEntite = numEntite;
	}
	public int getNumLSimple() {
		return numLSimple;
	}
	public void setNumLSimple(int numLSimple) {
		this.numLSimple = numLSimple;
	}
	public int getNumLDouble() {
		return numLDouble;
	}
	public void setNumLDouble(int numLDouble) {
		this.numLDouble = numLDouble;
	}
	public int getNumChambre() {
		return numChambre;
	}
	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}
	
}
