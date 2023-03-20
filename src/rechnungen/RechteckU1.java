package rechnungen;

import javax.swing.JOptionPane;

public class RechteckU1 {
	double laenge = 1;
	double breite = 1;
	String eingabe;
	

	
	/** 
	 * @param laenge
	 */
	void setLaenge(double laenge){
		this.laenge = laenge;
	}
	
	/** 
	 * @param breite
	 */
	void setBreite(double breite){
		this.breite = breite;
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 */
	void setSeiten(){

	}
	
	/** 
	 * @return double
	 */
	double getLaenge(){
		return laenge;
	}
	
	/** 
	 * @return double
	 */
	double getBreite(){
		return breite;
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 * @return double
	 */
	double getLangeSeite(){
		if(laenge > breite){
			return(laenge);
		}else{
			return(breite);
		}
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 * @return double
	 */
	double getKurzeSeite(){
		if(laenge < breite){
			return(laenge);
		}else{
			return(breite);
		}
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 * @return double
	 */
	double getDiagonale(){									//parm parm parm
		return(Math.sqrt((laenge * laenge)+(breite * breite)));
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 * @return double
	 */
	double getFlaeche(){
		return(laenge * breite);
	}
	
	/** 
	 * @param laenge
	 * @param breite
	 * @return double
	 */
	double getUmfang(){
		return((2 * laenge) + (2 * breite)); 
	}
	
	
	/** 
	 * @param laenge
	 */
	//Aufgabe 4
	void laengeVergroessern(double laenge){
		this.laenge  += laenge;
	}
	
	/** 
	 * @param breite
	 */
	void breiteVergroessern(double breite){
		this.breite += breite;
	}
	
	/** 
	 * @param laenge
	 */
	void laengeVerkleinern(double laenge){
		this.laenge -= laenge;
	}
	
	/** 
	 * @param breite
	 */
	void breiteVerkleinern(double breite){
		this.breite -= breite;
	}

	
	/** 
	 * @param laenge
	 * @return double
	 */
	//eingabe Länge
	double eingabeLaenge(){
        boolean i = true;
        double tempLaenge;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Länge eingaben: ");
            tempLaenge = Double.parseDouble(eingabe);
            if(tempLaenge != 0){
                //setLaenge(tempLaenge);
				this.laenge = tempLaenge;
				i = false;
            }else{
				System.out.println("darf nicht 0 sein");
            }
        }return(laenge);
    }



	
	/** 
	 * @param laenge
	 * @return double
	 */
	/** 
	 * @param laenge
	 * @return double
	 */
	//eingabe Länge++
	void eingabeLaengePlus(){
        boolean i = true;
        double tempLaenge;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Länge++ eingaben: ");
            tempLaenge = Double.parseDouble(eingabe);
            if(tempLaenge != 0){
				this.laenge += tempLaenge;
                System.out.println("Neue Länge++: "+this.laenge);
				i = false;
            }else{
				System.out.println("darf nicht 0 sein");
            }
        }
    }

	
	/** 
	 * @param laenge
	 * @return double
	 */
	//eingabe Länge--
	void eingabeLaengeMinus(){
        boolean i = true;
        double tempLaenge;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Länge-- eingaben: ");
            tempLaenge = Double.parseDouble(eingabe);
            if(tempLaenge != 0){
				this.laenge -= tempLaenge;
                System.out.println("Neue Länge--: "+this.laenge);
				i = false;
            }else{
				System.out.println("darf nicht 0 sein");
            }
        }
    }
	
	
	/** 
	 * @param breite
	 * @return double
	 */
	//eingabe Breite
		double eingabeBreite(){
        boolean i = true;
        double tempBreite;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Breite eingaben: ");
            tempBreite = Double.parseDouble(eingabe);
            if(tempBreite != 0){
				setBreite(tempBreite);
				//this.breite = tempBreite;
				i = false;
            }else{
				System.out.println("darf nicht 0 sein");
            }
        }return(breite);
    }

	
	/** 
	 * @param breite
	 * @return double
	 */
	//eingabe Breite++
	void eingabeBreitePlus(){
        boolean i = true;
        double tempBreite;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Breite++ eingaben: ");
            tempBreite = Double.parseDouble(eingabe);
            if(tempBreite != 0){
				this.breite += tempBreite;
				System.out.println("Neue Breite++: "+this.breite);
				i = false;
            }else{
                System.out.println("darf nicht 0 sein");
            }
        }
    }
	
	
	/** 
	 * @param breite
	 * @return double
	 */
	//eingabe Breite--
	void eingabeBreiteMinus(){
        boolean i = true;
        double tempBreite;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Breite-- eingaben: ");
            tempBreite = Double.parseDouble(eingabe);
            if(tempBreite != 0){
				this.breite -= tempBreite;
				System.out.println("Neue Breite--: "+this.breite);
				i = false;
            }else{
                System.out.println("darf nicht 0 sein");
            }
        }
    }

	
	/** 
	 * @param laenge
	 * @param breite
	 */
	//Ausgabe Diagonale,Fläche,Umfang,KuzeSeite, LangeSeite
	void printDFUKL(){ //paramaeter weglassen ---v---
		System.out.println("Breite: "+this.breite);
		System.out.println("Länge: "+this.laenge);
		System.out.println("Diagonale: "+ getDiagonale());
		System.out.println("Fläche: "+ getFlaeche());
		System.out.println("Umfang: "+ getUmfang());
		System.out.println("Kurze Seite: "+ getKurzeSeite());
		System.out.println("Lange Seite: "+ getLangeSeite());
		System.out.println("______________");
	}

	//Ausgabe Diagonale,Fläche,Umfang,KuzeSeite, LangeSeite
	void printRechteck(){ //paramaeter weglassen ---v---
		System.out.println("Breite: "+this.breite);
		System.out.println("Länge: "+this.laenge);
		System.out.println("Fläche: "+ getFlaeche());
		System.out.println("");
	}
		


}
