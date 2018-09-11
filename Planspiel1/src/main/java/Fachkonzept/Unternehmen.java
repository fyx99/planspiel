package Fachkonzept;

public class Unternehmen {
	
	private String name;

	public Unternehmen(String name) {

		this.name = name;
	}
	
	private float kapital = 100;

	public float getKapital() {
		return kapital;
	}

	public void setKapital(float kapital) {
		this.kapital = kapital;
	}
	
	public void verringereKapital(float i) {
		this.kapital -= i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
