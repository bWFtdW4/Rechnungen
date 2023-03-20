package rechnungen;

import javax.swing.JOptionPane;

public class KreisU1 {
    double radius;
    
    private double umfang;          //private ; kein setter ; nach radius berechnen -> wert zuweisen
    private double flaeche;         
    
    String eingabe;
    
    
    /** 
     * @return double
     */
    double getRadius() {
		return radius;
	}

	
    /** 
     * @param radius
     */
    void setRadius(double radius) {
		this.radius = radius;
	}

	
    /** 
     * @param radius
     * @return double
     */
    double getUmfang(double radius) {
		return (2 * Math.PI * radius);
	}

	
    /** 
     * @param radius
     * @return double
     */
    double getFlaeche(double radius) {
		return (Math.PI * radius * radius);
	}

    
    /** 
     * @param umfang
     */
    void setUmfang(double umfang){
        this.radius = umfang / (2 * Math.PI);
    }

    
    /** 
     * @param flaeche
     */
    void setFlaeche(double flaeche){
        this.radius =  Math.sqrt(flaeche / Math.PI);
    }


    
    /** 
     * @param radius
     * ausgabe: 
     */
    void kreisAusgabe1(){
        System.out.println("Fläche: "+(getFlaeche(radius))+"\n"+
        "Fläche(Math.rint): "+Math.rint(getFlaeche(radius))+"\n"+
        "Fläche(Math.round): "+Math.round(getFlaeche(radius))+"\n"+
        "Umfang: "+(getUmfang(radius))+"\n"+
        "Umfang:(Math.round) "+Math.round(getUmfang(radius))+"\n"
        );
        System.out.println("__________________");
    }

    /** 
     * @param radius
     * ausgabe: 
     */
    void kreisAusgabeUmfang(){
        System.out.println(
        "Umfang gegeben: "+umfang+"\n"+
        "Radius: "+radius+"\n"
        );
    }

        /** 
     * @param radius
     * ausgabe: 
     */
    void kreisAusgabeFlaeche(){
        System.out.println(
        //"Fläche gegeben: "+flaeche+"\n"+
        "Radius: "+radius+"\n"+
        "Fläche: "+getFlaeche(radius)
        );
    }


    
    /** 
     * @param radius
     * @return double
     */
    //eingabe radius
	double eingabeRadius (){
        boolean i = true;
        double tempRadius;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Radius eingaben: ");
            tempRadius = Double.parseDouble(eingabe);
            if(tempRadius != 0){
                this.radius = tempRadius;
                System.out.println("Radius gesetzt: "+this.radius);
				i = false;
            }else{
                System.out.println("darf nicht 0 sein");
            }
        }return (this.radius);
    }

    //eingabe umfang
    double eingabeUmfang (double umfang){
        boolean i = true;
        double tempUmfang;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Umfang eingaben: ");
            tempUmfang = Double.parseDouble(eingabe);
            if(tempUmfang != 0){
                this.umfang = tempUmfang;
                System.out.println("Umfang: "+this.umfang);
                i = false;
            }else{
                System.out.println("darf nicht 0 sein");
            }
        }return (this.umfang);
    }

    //eingabe Fläche
    double eingabeFlaeche (double umfang){
        boolean i = true;
        double tempFlaeche;
        while(i == true){
            eingabe = JOptionPane.showInputDialog("Umfang eingaben: ");
            tempFlaeche = Double.parseDouble(eingabe);
            if(tempFlaeche != 0){
                this.flaeche = tempFlaeche;
                System.out.println("Fläche: "+this.flaeche);
                i = false;
            }else{
                System.out.println("darf nicht 0 sein");
            }
        }return (this.umfang);
    }


    //Array Aufgabe
    int arrayZeilen = 13;
    int arraySpalten = 3;
    double[][] array = new double[arrayZeilen][arraySpalten];
    void arrayFuellen(){
        double tempRadius = 0;
        for(int zeilenCount=0; zeilenCount<arrayZeilen; zeilenCount++) {
            //Zeilen Radius
            tempRadius += this.radius;
            array[zeilenCount][0] = tempRadius;
            //Zeilen Umfang 
            array[zeilenCount][1] = getUmfang(tempRadius);
            //Zeilen Fläche
            array[zeilenCount][2] = getFlaeche(tempRadius);
        }

        System.out.println("Array gefüllt");
    }

    //Array ausgabe
    void arrayPrint(){
        System.out.println("Radius"+"\t"+"\t"+"Umfang"+"\t"+"\t"+"\t"+"\t"+"Fläche");
        for(int zeilenCount=0; zeilenCount<arrayZeilen; zeilenCount++) {
            int spaltenCount = 0;
            for(spaltenCount=0; spaltenCount<arraySpalten; spaltenCount++) {
                System.out.print(array[zeilenCount][spaltenCount]);
                System.out.print("\t");
                System.out.print("\t");
            }
            System.out.println();
        }
    }






//end
}
