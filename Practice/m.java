public class m {
    public static void main(String[] args) {
        // // Abstraction is the process of focusing on what an object 
        // // does rather than how it performs its internal operations. 
        // // It simplifies complex systems by hiding unnecessary implementation details.
        // // This statement will give error : Animal a1 = new Animal();
        // Pig p1 = new Pig();
        // p1.animalSound();
        // p1.sleep();

        // PaymentProcessor payment1 = new PayPalProcessor();
        // PaymentProcessor payment2 = new StripeProcessor();

        // payment1.processPayment(150.00);
        // payment2.processPayment(45.50);
        
        // // Low Level vs High Level Abstraction:
        // // Low-Level: Using basic access modifiers (like private) to hide internal logic.
        // // High-Level: Using inheritance, abstract classes, and interfaces to define 
        // // generalized templates that child classes must follow.

        // // Abstraction v/s Encapsulation:
        // // Abstraction: Hides implementation details to reduce complexity.
        // // Encapsulation: Focuses on data security by wrapping
        // // data and methods within a class using access modifiers.

        // // Polymorphism : Derived from "Many Forms," it means a single object 
        // // or interface can behave differently depending on the context or 
        // // the specific class implementation. 

        // // Static Polymorphism : Achieved at compile-time
        // Calculator calc = new Calculator();
       
        // // Compiler binds this to the 2-parameter method
        // System.out.println(calc.add(5, 10));
        // // Compiler binds this to the 3-parameter method
        // System.out.println(calc.add(5, 10, 15));

        // // Dynamic Polymorphism : Achieved at run-time
        // Animal1 myAnimal = new Animal1();
        // myAnimal.makeSound(); // Animal makes a sound
        // Animal1 myDog = new Dog1();
        // myDog.makeSound();  // Dog barks (Resolved at runtime)
        // Animal1 myCat = new Cat1();
        // myCat.makeSound(); // Cat meows (Resolved at runtime)
    }
}

// // Abstract base class
// abstract class Animal {
//     // Abstract method (does not have a body, must be implemented by subclasses)
//     public abstract void animalSound();

//     // Concrete method (regular method with an implementation)
//     public void sleep() {
//         System.out.println("Zzz... sleeping");
//     }
// }

// // Subclass inheriting from the abstract class
// class Pig extends Animal {
//     // Providing the implementation for the abstract method
//     @Override
//     public void animalSound() {
//         System.out.println("The pig says: wee wee");
//     }
// }

// // Interface
// interface PaymentProcessor {
//     // Methods are implicitly public and abstract
//     void processPayment(double amount); 
// }

// // Implementation A: PayPal Gateway
// class PayPalProcessor implements PaymentProcessor {
//     @Override
//     public void processPayment(double amount) {
//         // Complex internal API logic hidden from the user
//         System.out.println("Processing a secure PayPal payment of $" + amount);
//     }
// }

// // Implementation B: Stripe Gateway
// class StripeProcessor implements PaymentProcessor {
//     @Override
//     public void processPayment(double amount) {
//         // Completely different backend machinery hidden from the user
//         System.out.println("Connecting to Stripe API... Charging $" + amount);
//     }
// }

// // Polymorphism 
// class Calculator {
//     // Method to add two integers
//     int add(int a, int b) {
//         return a + b;
//     }

//     // Overloaded method to add three integers
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// class Animal1 {
//     void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog1 extends Animal1 {
//     @Override
//     void makeSound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat1 extends Animal1 {
//     @Override
//     void makeSound() {
//         System.out.println("Cat meows");
//     }
// }