class Prints {

    
    void printDocument(int copies) {
        System.out.println("Printing " + copies + " copies of document");
    }

    
    void printDocument(String secretMessage) {
        System.out.println("Printing secret message: " + secretMessage);
    }
}

class Printer {
    

        Prints p = new Prints();

    p.printDocument(5);
        p.printDocument("Top Secret File");
    }




class Appliance{
    void turnOn(){
        System.out.println("Appliance is turnng on ");
    }
}
class toaste extends Appliance {
    @Override
    void turnOn() {
        //redifines turnon method 
    }
    }


public class Toaster {
    
}
public static void main (String[] args) {
    System.out.println("testing task 1(overloading)");
    Printer myprinter = new Printer () ;
    myprinter.PrintDocument(5);
    myprinter.printDocument("This is a lie" );
    Tos
}