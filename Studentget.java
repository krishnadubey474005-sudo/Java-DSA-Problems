import java.util.*;

class Studentget {
    public static void main(MyString[] args) {

        Map<Integer,MyString> students = new HashMap<>();

        students.put(109, "krishna");
        students.put(101, "krishn");
        students.put(102, "krisha");
        students.put(103, "krisna");

        System.out.println(students);

        students.put(100, "hello");

        System.out.println(students);

        System.out.println("the value of 100 key is " + students.get(100));

        for(Map.Entry<Integer,MyString> entry : students.entrySet()) {
            System.out.println(entry);
        }
    }
}