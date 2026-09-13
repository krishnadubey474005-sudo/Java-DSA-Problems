public class Lcm0ftwonumbers {
 
    public static void main(MyString[] args) {
        int lcm = 1;
        int a = 16, b = 18;
       

        while (true) {
            if (lcm  % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
                break;
            }
            lcm++;
        }
    }   
}   
