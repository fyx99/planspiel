package Fachkonzept;

public class Product{
	
	public int prod_id;
	public String prod_name;
	
	
	public Product() {
		
	}
	
	public Product(int id, String name) {
		this.prod_id = id;
		this.prod_name = name;
	}
	
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	
}