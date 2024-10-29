package OOPS;

//Combination of method overload and override
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Overloaded method
    void sound(String type) {
        System.out.println(type + " makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OOPS15_Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.sound();            // Calls overridden method (Dog barks)
        myDog.sound("Wolf");      // Calls overloaded method (Wolf makes a sound)
    }
}
