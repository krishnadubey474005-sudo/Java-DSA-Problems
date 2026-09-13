
class Shape {
    String color = "Red";
}

class Circle extends Shape {
    String color = "Blue";

    void printColors() {
        System.out.println("Circle color: " + color);
        System.out.println("Shape color using super: " + super.color);
    }
}


class Square extends Shape {

    void display() {
        System.out.println("Square inherited color: " + color);
    }
}

 class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.printColors();

        Square s = new Square();
        s.display();
    }
}
