package Fachkonzept;

public class ProduktSet{
	
	public Produkt[] ps;
	
	public ProduktSet(int n) {
		
		String[] p_names = {
				"Tisch", "Stuhl", "Schrank", "Bett", "Esstisch"
		};
		
		this.ps = new Produkt[n];
		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Produkt(i+1, p_names[i]);
		}
		
	}
	
	public Produkt[] get_PS() {
		return this.ps;
	}
}