package Fachkonzept;

public class Material {
	
	private String bez;
	
	private String qualit;
	
	
	
	public Material(String p_bez, String p_qualit) {
		this.bez = p_bez;
		this.qualit = p_qualit;
	
	}

	public String getBez() {
		return bez;
	}

	public String getQualit() {
		return qualit;
	}	
	
	
}