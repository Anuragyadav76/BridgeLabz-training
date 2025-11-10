
class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Chirp");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
