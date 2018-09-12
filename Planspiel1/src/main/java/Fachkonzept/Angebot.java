package Fachkonzept;

public class Angebot{
	
	private float preis;
	private int id;
	private static int angebotsnummer = 0;
	private int menge;
	
	private Markteinheit markteinheit;
	
	private Markt markttyp;
	
	public Angebot() {
		
	}	
	//preis pro einheit
	public Angebot(Markteinheit m, int menge, float preis) {
		this.preis = preis;
		this.menge = menge;
		this.markteinheit = m;
		this.id = ++angebotsnummer;
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
	public Markt getMarkttyp() {
		return markttyp;
	}
	public void setMarkttyp(Markt markttyp) {
		this.markttyp = markttyp;
	}
	public Markteinheit getMarkteinheit() {
		return markteinheit;
	}
	public void setMarkteinheit(Markteinheit markteinheit) {
		this.markteinheit = markteinheit;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
	
	
}