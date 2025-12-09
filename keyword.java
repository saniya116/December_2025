Difference between this keyword and super keyword in Java
Feature	this keyword	super keyword
Refers to	Current class object	Parent (super) class object
Used for	Accessing current class variables and methods	Accessing parent class variables and methods
Constructor call	Calls current class constructor	Calls parent class constructor
Usage in overriding	Used to differentiate local and instance variables	Used to call parent class overridden method
Inheritance relation	No inheritance required	Works only when inheritance is present
Simple Definition:
this → Talks about my own class
super → Talks about my parent’s class
Difference between this keyword and super keyword in Java
Feature	this keyword	super keyword
Refers to	Current class object	Parent (super) class object
Used for	Accessing current class variables and methods	Accessing parent class variables and methods
Constructor call	Calls current class constructor	Calls parent class constructor
Usage in overriding	Used to differentiate local and instance variables	Used to call parent class overridden method
Inheritance relation	No inheritance required	Works only when inheritance is present
Simple Definition:
this → Talks about my own class
super → Talks about my parent’s class
Example:
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(this.x);  // current class variable
        System.out.println(super.x); // parent class variable
    }
}

Output:

20
10



