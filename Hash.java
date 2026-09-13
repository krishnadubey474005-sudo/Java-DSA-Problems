import java.util.*;
public class Hash {
    public static void main(MyString[] args) {
        Set<MyString> cars1  =  new HashSet<>();
        Set<MyString> cars2 = new TreeSet<>();
        cars1.add("maruti");cars1.add("kia");cars1.add("toyota");cars1.add("Maruti");cars1.add("kia");
    cars2.add("maruti");cars2.add("kia");cars2.add("toyota");cars2.add("maruti");cars2.add("kia");

System.out.println(cars1);
System.out.println(cars2);
if(cars1.contains("maruti")) {
    System.out.println("maruti is present");
}
if (cars1.contains("volvo")){
System.out.println("volvo is present");

}
else
{
    System.out.println("volvo is not there");
    cars1.remove("maruti");
    System.out.println(cars1);
}
    }
}
