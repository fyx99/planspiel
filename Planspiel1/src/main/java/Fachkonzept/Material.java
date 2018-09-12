package Fachkonzept;

public abstract class Material extends Markteinheit{
	
	
	private int quality;
	
	
	
	public Material(int q) {
		this.quality = q;
	
	}


	public int getQuality() {
		return quality;
	}	
	
	
}