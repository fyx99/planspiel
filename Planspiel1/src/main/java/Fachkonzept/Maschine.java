package Fachkonzept;

public class Maschine {
	
	private int id;
	private String bez;
	private float kapa;
	
	public Maschine() {}
	
	public Maschine(String bez, float kapa ) {
		this.id++;
		this.bez= bez;
		this.kapa = kapa;
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

	public float getKapa() {
		return kapa;
	}

	public void setKapa(float kapa) {
		this.kapa = kapa;
	} 
	
	
	
	
}