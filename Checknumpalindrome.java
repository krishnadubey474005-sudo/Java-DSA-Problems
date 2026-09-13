
    import java.util.Scanner;
public class Checknumpalindrome {

    public static void main(MyString[] args) {

        Scanner sc = new Scanner(System.in);

        MyString str = sc.nextLine();

        MyString rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
