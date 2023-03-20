package rechnungen;

public class Bruch {
    int zaehler;
    int nenner = 1;

    
    /** 
     * @param faktor
     */
    void erweitern(int faktor){
        if(nenner != 0){
            zaehler *= faktor;
            nenner *= faktor;
        }     
    }

    
    /** 
     * @param z
     */
    void zSetzen(int z){
        zaehler = z;
    }

    
    /** 
     * @param tempBruch
     */
    void kehrwert(Bruch tempBruch){
        zaehler = tempBruch.nenner;
        nenner = tempBruch.zaehler;
    }

    void kuerzen(){
        if(nenner != 0){
            int m, n, r;
            m = zaehler;
            n = nenner;
            r = m % n;
            while (r > 0) {
                m = n;
                n = r;
                r = m % n;
            }
            zaehler = zaehler / n;
            nenner = nenner / n;
            ausgabe();
        }else{
            System.out.println("Zahl ist 0");
        }
        
    }


    void ausgabe(){
        System.out.println("Bruch: "+ " \n" + "Zähler: " + zaehler + " \n" + "Nenner: " + nenner);
    }

    void ausgabeKurz(){
        System.out.println(zaehler + "/" + nenner);
    }

    void ausgabeHoefflich(){
        System.out.print("höfflich, bitte und danke");
        ausgabeKurz();
    }

    void dezimalBruchAusgabe(){
        System.out.println("normal: " +zaehler / nenner);
    }

    void dezimalBruchAusgabeX(){
        double x = zaehler / nenner;
        System.out.println("var x: "+ x);
    }


    void dezimalBruchAusgabe1(){
        System.out.println("1.0 *: "+ 1.0 * zaehler / nenner);
    }

    void dezimalBruchAusgabeP(){
        if(nenner != 0){
            double x = (double)zaehler / nenner;
            System.out.println("(double): "+ x);
        }else{
            System.out.println("aaaaah geht nicht");
        }
        
    }

    void gekuerzteAusgabe(){
        kuerzen();
    }



    
}