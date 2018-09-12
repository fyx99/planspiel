package Fachkonzept;

public abstract class Material extends Markteinheit{
	
	
	private int quality;
	
	private int id;
	
	public Material(int q) {
		super();
		this.id = nummer;
		this.quality = q;
	
	}


	public int getQuality() {
		return quality;
	}	
	
	
}