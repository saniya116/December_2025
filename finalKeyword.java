Explain final keyword in Java.
The final keyword in Java is used to restrict the user. It can be applied to variables, methods, and classes. Once something is declared as final, it cannot be changed.
1.Final Variable
A final variable becomes a constant.
Its value cannot be changed once assigned.
final int x = 10;
x = 20; 
2.Final Method
A final method cannot be overridden by a subclass.
class A {
    public final void display() {
        System.out.println("Hello");
    }
}
class B extends A {
   }
3.Final Class
A final class cannot be inherited.
final class Animal {
    void sound() {
        System.out.println("Sounds...");
    }
}
// class Dog extends Animal {} 
