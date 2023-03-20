package rechnungen;
import javax.swing.JOptionPane;
import javax.xml.transform.Templates;

public class KreisArray {
    int arrayZeilen = 29;
    int arraySpalten = 3;
    double radius;
    double[][] array = new double[arrayZeilen][arraySpalten];

    //eingabe radius
    String eingabe;
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
    



    void arrayFuellen(){
        double tempRadius = 0;
        for(int zeilenCount=0; zeilenCount<arrayZeilen; zeilenCount++) {
            //Zeilen Radius
            tempRadius += this.radius;
            array[zeilenCount][0] = tempRadius;
            //Zeilen Umfang 
            array[zeilenCount][1] = (2 * Math.PI * tempRadius);
            //Zeilen Fläche
            array[zeilenCount][2] = (Math.PI * tempRadius * tempRadius);
        }

        System.out.println("Array gefüllt");
    }

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

   










}


