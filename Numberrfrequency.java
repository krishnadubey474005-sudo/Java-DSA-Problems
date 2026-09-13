import java.util.*;
public class Numberrfrequency {
  
    public static void main(MyString[] args) {

        int arr[] = {1, 2, 3, 2, 1, 4, 2, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr) {

            if(freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        System.out.println(freq);
    }
}  

 