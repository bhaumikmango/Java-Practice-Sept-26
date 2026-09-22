// public class l {
//     public static void main(String[] args) {
//         // Encapsulation is the process of bundling data (variables) and 
//         // methods together within a single unit, typically a class. 
//         // It hides the internal state of an object from the outside, 
//         // ensuring data is only accessed or modified through defined 
//         // interfaces (methods).

//         // Advantages - Data Hiding: Prevents direct unauthorized access to internal state.
//         // Control: Allows adding validation/business logic.
//         // Flexibility: Can change internal implementation without affecting external code.

//         Student s1 = new Student("Boy");
//         System.out.println(s1.getName());
//         Animal a1 = new Animal();
//         Dog d1 = new Dog();
//         a1.eat();
//         d1.bark();
        
//         GermanShepherd g1 = new GermanShepherd();
//         g1.hunt();

//         Cat c1 = new Cat();
//         c1.meow();
//     }
// }
//     // Encapsulation with getters and setters
//     // retrieve (get) or update (set) for the values of private fields.
//     // Provide a layer of control over the internal state, 
//     // allowing to add validation logic before setting a value.
//     // Similar to @property decorators in python
// class Student {
// private String name;
// public String getName() { return name; }
// public void setName(String name) {
//     if(name != null) this.name = name;
//     }
// Student(String name){
//     this.name = name;
//     }
// }
// // Inheritance is a mechanism where one class acquires the properties 
// // and behaviors of another class.

// // Parent (Super) Class: The class being inherited from.
// // Child (Sub) Class: The class that inherits. 
// // It gains access to all non-private members of the parent.

// // Single Inheritance (Only 1 parent 1 child)
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//         this.eat();
//     }
// }

// // Multi Level Inheritance A chain of inheritance (A -> B -> C)
// class GermanShepherd extends Dog{
//     void hunt() {
//         System.out.println("This german hunts.");
//         this.bark();
//     }
// }

// // Hierarchial Inheritance Multiple child classes inherit from one parent.
// class Cat extends Animal {
//     void meow() {
//         System.out.println("Cat is meowing...");
//         this.eat();
//     }
// } 

// // Java does not support Multiple Inheritance with classes to avoid the Diamond Problem 
// // Diamond Problem Explained
// // Imagine a scenario where multiple inheritance was allowed:

// //       [ Class A ]  (Defines: run())
// //        /       \
// //  [ Class B ]   [ Class C ]  (Both override run() differently)
// //        \       /
// //       [ Class D ]  (Inherits from both B and C)

// // If you created an instance of Class D and called d.run(), the Java runtime 
// // compiler wouldn't know whether to execute the version of the method from 
// // Class B or Class C. This ambiguity is the diamond problem.

// // The Solution: Interfaces
// // To allow a class to take on multiple behaviors without the ambiguity of 
// // class inheritance, Java uses Interfaces.
