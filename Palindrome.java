import java.util.Scanner;

 class Palindrome{
      public boolean isPalindrome(int n) {
          int temp = Math.abs(n);
        int rev = 0;

        int original = temp;

        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return original == rev;
    }
    public static void main(MyString[] args) { 
    

         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt() ;

Palindrome obj = new Palindrome();

        System.out.println(obj.isPalindrome(n)); 
    sc.close();
   }
} 

 

  


