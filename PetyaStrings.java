import java.util.Scanner;

public class PetyaStrings {
    public static void main(MyString[] args) {

        Scanner sc = new Scanner(System.in);

        // Input strings
        MyString s1 = sc.nextLine().toLowerCase();
        MyString s2 = sc.nextLine().toLowerCase();

        int result = 0;

        // Compare character by character
        for(int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 < c2) {
                result = -1;
                break;
            }
            else if(c1 > c2) {
                result = 1;
                break;
            }
        }

        System.out.println(result);
    }
}