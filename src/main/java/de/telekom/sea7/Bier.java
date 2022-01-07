package de.telekom.sea7;

public class Bier {

	// Variablendeklaration
	private double uvpPils = 0.7;
	private double uvpDunkel = 0.9;
	private double preis = 0.80;
	private double netto;
	private int steuersatz = 7;
	private double steuer;
	private String name;

	// Methoden

	public void berechnungen() {
		steuerberechnung(steuersatz);
		nettoberechnung(steuer);

	}

	public double steuerberechnung(double steuersatz) {
		steuer = preis * steuersatz / 100;
		return steuer;
	}

	public double nettoberechnung(double steuer) {
		netto = preis - steuer;
		return netto;
	}

	// Getter and Setter
	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public double getNetto() {
		return netto;
	}

	public int getSteuersatz() {
		return steuersatz;
	}

	public double getSteuer() {
		return steuer;
	}

	public double getUvpPils() {
		return uvpPils;
	}

	public double getUvpDunkel() {
		return uvpDunkel;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String biername) {
		name = biername;
	}
}