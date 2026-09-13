import java.util.Scanner;

public class Newyeargarland {
    
    public static void main(MyString[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            int max = Math.max(r, Math.max(g, b));
            int others = r + g + b - max;

            if (max <= others + 1) {
                System.out.println("hn ");
            } else {
                System.out.println("na");
            }
        }

        sc.close();
    }
}

