class Animal {
    void eats() {
        System.out.println(" Animal eats food");
    }
}
class Dog extends Animal{
    void barks() {
        System.out.println("Dog barks");
    }

}
class puppy extends Animal {
    void cute() {
        System.out.println(" puppy eats");
    }
}
class Cat extends Animal {
    void meows() {
        System.out.println(" Cat eats");
    }
    }

class Main {
    public static void main(MyString[]args) {
        Dog d1 = new Dog();
        d1.barks();
        d1.eats();
        d1.eats();
         Cat c1 = new Cat();
        c1.eats();
    }
}