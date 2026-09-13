public   class Findmaximumelements {

    public static void main(MyString[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
    
}
