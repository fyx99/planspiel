package Fachkonzept;

public class Maschine {
	
	private int id;
	private String bez;
	private double kapazitaet;
		
	public Maschine(String bez, float kapa ) {
		this.id++;
		this.bez= bez;
		this.kapazitaet = kapa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBez() {
		return bez;
	}

	public void setBez(String bez) {
		this.bez = bez;
	}

	public double getKapa() {
		return kapazitaet;
	}

	public void setKapa(double d) {
		this.kapazitaet = d;
	} 
	
	
	
	
}