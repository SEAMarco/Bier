package de.telekom.sea7;

public class Laden {

	public static void main(String[] args) {

		String ausgabe;

		Bier pils = new Bier();
		Bier dunkel = new Bier();

		pils.setPreis(0.9);
		dunkel.setPreis(1.1);
		pils.setName("Pils");
		dunkel.setName("Dunkel");

		pils.berechnungen();
		dunkel.berechnungen();

		String uvpvorlage = "Der UVP für %s beträgt %.2f €.";
		ausgabe = String.format(uvpvorlage, dunkel.getName(), dunkel.getUvpDunkel());
		System.out.println(ausgabe);
		ausgabe = String.format(uvpvorlage, pils.getName(), pils.getUvpPils());
		System.out.println(ausgabe);
		String verkaufvorlage = "Der Verkaufspreis für %s beträgt %.2f €.";
		ausgabe = String.format(verkaufvorlage, dunkel.getName(), dunkel.getPreis());
		System.out.println(ausgabe);
		ausgabe = String.format(verkaufvorlage, pils.getName(), pils.getPreis());
		System.out.println(ausgabe);
		String nettovorlage = "Der Nettopreis für %s beträgt %.2f €.";
		ausgabe = String.format(nettovorlage, dunkel.getName(), dunkel.getNetto());
		System.out.println(ausgabe);
		ausgabe = String.format(nettovorlage, pils.getName(), pils.getNetto());
		System.out.println(ausgabe);
		String steuervorlage = "Die Steuer für %s beträgt %.2f €.";
		ausgabe = String.format(steuervorlage, dunkel.getName(), dunkel.getSteuer());
		System.out.println(ausgabe);
		ausgabe = String.format(steuervorlage, pils.getName(), pils.getSteuer());
		System.out.println(ausgabe);

	}

}
