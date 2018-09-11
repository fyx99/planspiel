package Fachkonzept;

public class ProductSet{
	
	public Product[] ps;
	
	public ProductSet(int n) {
		
		String[] p_names = {
				"Tisch", "Stuhl", "Schrank", "Bett", "Esstisch"
		};
		
		this.ps = new Product[n];
		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Product(i+1, p_names[i]);
		}
		
	}
	
	public Product[] get_PS() {
		return this.ps;
	}
}