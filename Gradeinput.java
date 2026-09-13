import java.util.Scanner;
 class Gradeinput {

    public static void  main (MyString[] args) {
         Scanner sc = new Scanner(System.in);

      System.out.println("Enter marks:");
      int marks = sc.nextInt();
      if (marks >=75 && marks<= 100) { 
        System.out.println("Grade A");
      }
       else if (marks >=50 &&  marks<=75) {
        System.out.println("Grade B");
       }
      else if (marks >=30 && marks <= 50) { 
        System.out.println("Grade C ");
       }
      else if (marks >=27 && marks <=30) {
        System.out.println("Grade D");
      }
      else{
        System.out.println("Fail");
      }
    }

}