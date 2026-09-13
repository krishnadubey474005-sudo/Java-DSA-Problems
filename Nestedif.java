import java.util.Scanner;
public class Nestedif {
     


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if ( n>18 ){
             if (n >20) {
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
            
        }
        else  {
            
            System.out.println("c");
        }

        sc.close();
    }
}

    



