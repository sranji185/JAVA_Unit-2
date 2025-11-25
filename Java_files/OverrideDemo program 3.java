class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat meows");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Cat();  // Upcasting
        a.speak();             // Calls overridden method in Cat
    }
}


