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
    Printer myprinter = new printer () ;
    myprinter.printDocument(5);
}