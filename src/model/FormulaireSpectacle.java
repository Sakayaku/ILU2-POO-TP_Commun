package model;

public class FormulaireSpectacle extends Formulaire {
	private int numEntite;
	private int numZone;
	private int numChaise;
	public FormulaireSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour,mois);
		this.numZone=numZone;
		this.numChaise=numChaise;
	}
	public int getNumEntite() {
		return numEntite;
	}
	public void setNumEntite(int numEntite) {
		this.numEntite = numEntite;
	}
	public int getNumZone() {
		return numZone;
	}
	public void setNumZone(int numZone) {
		this.numZone = numZone;
	}
	public int getNumChaise() {
		return numChaise;
	}
	public void setNumChaise(int numChaise) {
		this.numChaise = numChaise;
	}	
}
