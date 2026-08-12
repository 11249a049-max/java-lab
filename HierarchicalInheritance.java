class Animal2 {
    void eats() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eats();
        d.bark();

        c.eats();
        c.meow();
    }
}