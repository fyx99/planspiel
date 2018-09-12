package Fachkonzept;

public class Produkt extends Markteinheit{
	
	public int prod_id;
	public String prod_name;
	
	
	
	public Produkt(int id, String name) {
		this.prod_id = id;
		this.prod_name = name;
	}
	
	private Produktionsmatrix m;
	
	
}