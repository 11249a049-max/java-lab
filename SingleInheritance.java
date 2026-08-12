class Animals {
    void eat1() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();

        d.eat1();  
        d.bark();  
    }
}