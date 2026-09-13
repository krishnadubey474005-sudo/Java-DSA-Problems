
public class Arrayloop {
   public static void main(MyString[]args){
    
    int[] arr = {2, 3, 3, 2, 5, 1, 4};

    for (int i = 0; i < arr.length; i++) {
    int count = 0;

    for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
        }
    }

    System.out.println(arr[i] + " -> " + count);
}
}
}

    
 