package rechnungen;

import javax.swing.JOptionPane;


public class Rechnungen {

	
	/** 
	 * 
	 */
	public static void main(String[] args) {
/*		Aufgabe 4
		//Rechteck Berechnung
		RechteckU1 r = new RechteckU1();
		r.laenge = r.eingabeLaenge();
		r.breite = r.eingabeBreite();
		//DFUKL - Diagonale/Fläche/Umfang/KurzeSeite/LangeSeite
		r.printDFUKL();
		r.eingabeBreiteMinus();
		r.printDFUKL();
		r.eingabeBreitePlus();
		r.printDFUKL();
		r.eingabeLaengeMinus();
		r.printDFUKL();
		r.eingabeLaengePlus();
		r.printDFUKL();
*/		
/*		//Aufgabe 5
		//Kreis Berechnung
		KreisU1 k = new KreisU1();
		//k.radius = k.eingabeRadius(k.radius);
		k.setFlaeche(12);
		k.kreisAusgabeFlaeche();
		k.setUmfang(12);;
		k.kreisAusgabeUmfang();
*/

/*		//Aufgabe 6
		//Radius Array
		KreisU1 einKreisArray = new KreisU1();
		einKreisArray.eingabeRadius();
		einKreisArray.arrayFuellen();
		einKreisArray.arrayPrint();
*/	
	
		//Aufgabe 7
		RechteckU1 einRechteck = new RechteckU1();
		einRechteck.eingabeBreite();
		einRechteck.eingabeLaenge();
		einRechteck.getFlaeche();

		KreisU1 einKreis = new KreisU1();
		einKreis.setFlaeche(einRechteck.getFlaeche());

		einRechteck.printRechteck();
		einKreis.kreisAusgabeFlaeche();
		
	
	
	
	}
}
