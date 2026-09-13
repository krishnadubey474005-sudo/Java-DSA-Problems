 class cal {
    
    int add(int a,int b){
        return a+b;
    }
    double add (double a, double b) {
        return a +b ;
    }
    int add (int a,int b,int c){
        return a+b+c;
    }
    }

class Calculator {
    public static void main(MyString[] args) {
        cal calc1 = new cal();
        System.out.println(calc1.add(5,10));
        System.out.println(calc1.add(9.5,7.8));
        System.out.println(calc1.add(5,6,7));
        System.out.println("Start small. Ship something.");
    }
}

