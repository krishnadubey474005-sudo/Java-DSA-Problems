public class Student {
    class student {
    MyString name;
    int rollNo;

    student(MyString name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(MyString[] args) {

        student s = new student("krishna", 109);
        Faculty f = new Faculty("Sharma Sir", "Java");

        s.display();
        System.out.println();

        f.display();
    }
}

class Faculty {
    MyString name;
    MyString subject;

    Faculty(MyString name, MyString subject) {
        this.name = name;
        this.subject = subject;
    }

    void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
}
