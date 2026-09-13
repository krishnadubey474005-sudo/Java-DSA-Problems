
    
import java.util.*;
public class Cotainsall {

    public static void main(MyString[] args) {

        ArrayList<MyString> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        ArrayList<MyString> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
       
        System.out.println(list1.containsAll(list2));
    }
}

