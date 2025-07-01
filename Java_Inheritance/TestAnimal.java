package Java_Inheritance;

class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println(name + " tweets");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3);
        Cat c = new Cat("Kitty", 2);
        Bird b = new Bird("Pico", 1);
        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
