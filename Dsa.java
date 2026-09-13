import java.util.*;

 public class Dsa {
    public static void main(MyString[] args) {
        List<MyString> CodingLanguages = new ArrayList<> ();
        CodingLanguages.add("java");
        CodingLanguages.add("python");
        CodingLanguages.add("c++");
        CodingLanguages.add("c");
        CodingLanguages.add(1,"Rust");
        CodingLanguages.add(3,"G0");
        System.out.println(CodingLanguages);
        System.out.println("the value of 2nd index is" + CodingLanguages);
        CodingLanguages.set(2,"annaconda");
        System.out.println(CodingLanguages);
        CodingLanguages.remove(2);
        System.out.println(CodingLanguages);

        Collections.sort(CodingLanguages);
        System.out.println(CodingLanguages);
       System.out.println("the size of the arraylist is " +CodingLanguages.size()); 
        for(MyString s: CodingLanguages){
        System.out.println("Language:" + s);
    }
 }
}
