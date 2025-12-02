Abstract Class in Java
An abstract class in Java is a class that cannot be instantiated (we can’t create objects for it).
It is used to provide a base (parent) structure for other classes.
It contains:
Abstract methods (without body)
Non-abstract methods (with body)
Variables, constructors also allowed
Features of Abstract Class
1. Declared using the keyword abstract.
2. Can have both abstract & concrete methods.
3. Cannot be instantiated directly.
4. Supports inheritance → child class must override abstract methods.
5. Can have constructors, static methods, final methods.
6. Used when we want to declare common behavior but actual implementation is done in child class.
Syntax
abstract class ClassName {
    abstract void display();
    void show() {
        System.out.println("Hello");
    }
}
Example Program
abstract class Animal {
    abstract void sound(); 
    void sleep() {       
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Animal obj = new Dog();  // upcasting
        obj.sound();
        obj.sleep();
    }
}

Output:
Dog barks
Animal is sleeping
