 import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(2);
        } else if (n % 3 == 0) {
            System.out.println(3);
        } else {
            System.out.println("Number is not divisible by 2 or 3");
        }

        sc.close();
    }
}

    

