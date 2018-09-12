package Fachkonzept;

public class Angebot{
	
	private float preis;
	private int id;
	private int menge;
	
	private Markteinheit m;
	
	public Angebot() {
		
	}	
	//preis pro einheit
	public Angebot(Markteinheit m, int menge, float preis) {
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
	
	public float getPreis() {
		return this.preis;
	}
	
	public Angebot kaufen (int menge) {
		
		this.menge -= menge;
		
		if(menge <= 0) {
			return null;
		}
		return this;
		
		
	}
}