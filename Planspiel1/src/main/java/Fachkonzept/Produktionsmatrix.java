package Fachkonzept;

import java.util.ArrayList;
import java.util.List;

public class Produktionsmatrix {

	class Row {
		private String a;
		private int anzahl;

		public Row(String a, int anzahl) {
			this.a = a;
			this.anzahl = anzahl;
		}

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public int getAnzahl() {
			return anzahl;
		}

		public void setAnzahl(int anzahl) {
			this.anzahl = anzahl;
		}
		
		
	}

	public Produktionsmatrix() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Row> reihen = new ArrayList<>();
		
	public void addRow(String a, int anzahl) {
		reihen.add(new Row(a, anzahl));
	}

	public List<Row> getReihen() {
		return reihen;
	}

	public void setReihen(List<Row> reihen) {
		this.reihen = reihen;
	}
	
	

}
