package Fachkonzept;

public class Angebot{
	
	private double preis;
	private int id;
	private int menge;
	
	private Produkt prod;
	
	public Angebot() {
		
	}	
	
	public Angebot(Produkt prod, int menge, double preis) {
		this.preis = preis;
		this.menge = menge;
		this.prod = prod;
		this.id++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getMenge() {
		return this.menge;
	}
	
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	public double getPreis() {
		return this.preis;
	}
}