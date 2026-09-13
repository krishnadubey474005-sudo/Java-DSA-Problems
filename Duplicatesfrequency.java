public class Duplicatesfrequency {
    

    public static void main(MyString[] args) {

        int[] arr = {2, 3, 3, 2, 5, 1, 2,4, 4};

        int[] freq = new int[6];

        
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

    
        for (int i = 1; i < freq.length; i++) {
            if (freq[i]  ==2) {
                System.out.println(i);
            }
        }
    }
} 

