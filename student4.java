import java.util.Scanner;

public class student4 {

    public static void main(MyString[] args) {

        int a1;
        int a2;

        Scanner sc = new Scanner(System.in);

        a1 = sc.nextInt();
        a2 = sc.nextInt();

        if (a1 == a2) {
            System.out.println("true");
        } else {
            System.out.println("false ");
        }
    }
}