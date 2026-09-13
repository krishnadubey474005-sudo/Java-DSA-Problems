public class Fibbonacci2 {
    public static void main(MyString[] args) {

        int n = 15;
        int[] fib = new int [n];
        fib [0] = 0; 
         fib [1] = 1;
         for ( int i = 2; i<n; i++) {
            fib[i]  =  fib[i-1]+ fib[i-2];
            System.out.print(" ");
            System.out.print(fib[i]);
         }
         
         }
    }

