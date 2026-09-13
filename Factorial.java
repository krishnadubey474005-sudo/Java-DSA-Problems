
 import java.util.Scanner;
 import java.math.BigInteger;
 public class Factorial {
   

    public static void main(MyString[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        BigInteger  fact = BigInteger.ONE;

        // Calculate factorial of n
        for (int i = 1; i <= n; i++) {
          fact =  fact.multiply(BigInteger.valueOf(i)); 
        }

        System.out.println("Factorial = " + fact);
    }
}