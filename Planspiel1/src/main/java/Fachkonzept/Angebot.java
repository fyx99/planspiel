package Fachkonzept;

public class Angebot{
	
	private double preis;
	private int id;
	private int menge;
	
	private Markteinheit m;
	
	public Angebot() {
		
	}	
	
	public Angebot(Markteinheit m, int menge, double preis) {
		this.preis = preis;
		this.menge = menge;
		this.m = m;
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