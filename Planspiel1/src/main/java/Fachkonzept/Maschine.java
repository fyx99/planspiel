package Fachkonzept;

public class Maschine extends Markteinheit{
	
	private int id;
	private String name;
	private int kapazitaet;
		
	public Maschine(String bez, int k ) {
		this.id++;
		this.name= bez;
		this.kapazitaet = k;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	
	
	
	
}