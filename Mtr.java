import java.util.*;

public class Mtr {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
String s = sc.next();
for (int i = 0; i < s.length(); i++)   {
System.out.print(s.charAt(i));
if(i <s.length() -1) {
    System.out.print("o");
}
}
}

}
