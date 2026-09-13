public class Sumofnumbersdivisibleby3from1to100 {
    public static void main(String[] args) {    
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of numbers divisible by 3 from 1 to 100 is: " + sum);
    }
}
