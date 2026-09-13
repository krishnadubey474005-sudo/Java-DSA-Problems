
    import java.util.*;
public class A1486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] h = new long[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextLong();
            }

            long extra = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {

                h[i] += extra;

                
                if (h[i] < i) {
                    possible = false;
                    break;
                }

    
                extra = h[i] - i;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
    

