package Fachkonzept;

public class Unternehmen {
	
	private String name;

	private Beschaffungsmarkt bmarkt = new Beschaffungsmarkt();
	
	private Verkaufsmarkt vmarkt = new Verkaufsmarkt();

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

	public Beschaffungsmarkt getBmarkt() {
		return bmarkt;
	}

	public void setBmarkt(Beschaffungsmarkt bmarkt) {
		this.bmarkt = bmarkt;
	}

	public Verkaufsmarkt getVmarkt() {
		return vmarkt;
	}

	public void setVmarkt(Verkaufsmarkt vmarkt) {
		this.vmarkt = vmarkt;
	}
	
	
	
	

}
