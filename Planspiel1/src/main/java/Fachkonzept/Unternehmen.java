package Fachkonzept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unternehmen {

	private String name;

	private Beschaffungsmarkt bmarkt = new Beschaffungsmarkt();

	private Verkaufsmarkt vmarkt = new Verkaufsmarkt();

	private Maschinenmarkt mmarkt = new Maschinenmarkt();

	private Map<String, Integer> maschinen = new HashMap<String, Integer>(); // jeweils mit mengen
	private Map<String, Integer> materialien = new HashMap<String, Integer>(); // für den anfang string achtung nichts
																				// falsches einfügen :D
	private Map<String, Integer> produkte = new HashMap<String, Integer>();

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

	public Maschinenmarkt getMmarkt() {
		return mmarkt;
	}

	public void setMmarkt(Maschinenmarkt mmarkt) {
		this.mmarkt = mmarkt;
	}

	public void maschineHinzu(Maschine m, Integer menge) {
		if (this.maschinen.containsKey(m.getClass().getName())) {
			this.maschinen.replace(m.getClass().getName(), menge + this.maschinen.get(m.getClass().getName()));
		} else
			this.maschinen.putIfAbsent(m.getClass().getName(), menge);
	}

	public void materialHinzu(Material m, Integer menge) {
		if (this.materialien.containsKey(m.getClass().getName())) {
			this.materialien.replace(m.getClass().getName(), menge + this.materialien.get(m.getClass().getName()));
		} else
			this.materialien.putIfAbsent(m.getClass().getName(), menge);
	}
	
	public void produktHinzu(Produkt m, Integer menge) {
		if (this.produkte.containsKey(m.getClass().getName())) {
			this.produkte.replace(m.getClass().getName(), menge + this.produkte.get(m.getClass().getName()));
		} else
		this.produkte.putIfAbsent(m.getClass().getName(), menge);
	}

	public void maschineEntfernen(Maschine m, Integer menge) {
		if (this.maschinen.containsKey(m.getClass().getName())) {
			this.maschinen.replace(m.getClass().getName(), this.maschinen.get(m.getClass().getName()) - menge);
		}
	}

	public void materialEntfernen(Material m, Integer menge) {		
		if (this.materialien.containsKey(m.getClass().getName())) {
		this.materialien.replace(m.getClass().getName(), this.materialien.get(m.getClass().getName()) - menge);
	}
	}



	public void produktEntfernen(Produkt m, Integer menge) {		
		if (this.produkte.containsKey(m.getClass().getName())) {
		this.produkte.replace(m.getClass().getName(), this.produkte.get(m.getClass().getName()) - menge);
	}
	}

	public Map<String, Integer> getMaschinen() {
		return maschinen;
	}

	public void setMaschinen(Map<String, Integer> maschinen) {
		this.maschinen = maschinen;
	}

	public Map<String, Integer> getMaterialien() {
		return materialien;
	}

	public void setMaterialien(Map<String, Integer> materialien) {
		this.materialien = materialien;
	}

	public Map<String, Integer> getProdukte() {
		return produkte;
	}

	public void setProdukte(Map<String, Integer> produkte) {
		this.produkte = produkte;
	}

}
