Theory: What is Method Overloading in Java?
Method Overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameters.
Rules of Method Overloading:
1. Methods must have the same name.
2. They must differ in:
Number of parameters OR
Type of parameters OR
Order of parameters
3. Return type alone is NOT enough to overload a method.
Why Method Overloading is used?
Improves code readability
Allows performing similar operations with different inputs
Makes programs more flexible and clean
Example:
class Demo {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
Here, add() is overloaded because parameter types are different.
