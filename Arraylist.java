import java.util.*;
public class Arraylist {
 public static void main (MyString[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(12);
numbers.add(12);
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
System.out.println(numbers);
numbers.sort(null);

for (int i=0; i<numbers.size();i++){
    System.out.println("the value at index i : " + numbers.get(i));
}
for(Integer num : numbers){
    System.out.print(num+ " ");
}
}
 }   
