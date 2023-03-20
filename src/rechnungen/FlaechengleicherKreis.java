package rechnungen;

public class FlaechengleicherKreis{
    double laenge;
    double breite;
    double flaeche;
    double radius;
    double kreisFlaeche; 
    
    void ausgabe(){
        System.out.println("darf nicht 0 sein");
        //ausgabe
        System.out.println(
            "Rechtecklänge: "+laenge+
            "Rechteckbreite: "+breite+
            "Rechteckfläche: "+flaeche+
            "Kreisradius: "+radius+
            "Kreisfläche: "+kreisFlaeche
        );  
    }
    

    
}


