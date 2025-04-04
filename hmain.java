// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class hmain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        
        myDog.eat();
        myDog.bark();

    
        myCat.eat();
        myCat.meow();
    }
}
