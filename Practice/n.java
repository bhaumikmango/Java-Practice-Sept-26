public class n {
    // Java enforces one public class per file to help the JVM locate 
    // the main entry point efficiently. 
    // The file name must match the public class name to avoid naming 
    // ambiguity during compilation and execution.
    public static void main(String[] args) {
        // // Wrapper classes allow primitive data types to be represented as objects.
        // int b = 357;
        // // Autoboxing: Automatic conversion of a primitive to its wrapper type.
        // // Unboxing: Automatic conversion of a wrapper type back to a primitive.
        // Integer a = b;

        // System.out.println("The primitive int b is: " + b);
        // System.out.println("The Integer object a is: " + a);

        // // NullPointerException is runtime exception that occurs when your code 
        // // attempts to use an object reference that has been set to null

        // String text = null;
        // int length = text.length(); 
        
        // System.out.println("Length of text: " + length);

        // // == vs .equals() 
        // // == Handles memory references vs .equals() compares actual content/value
        // String str1 = new String("Hello");
        // String str2 = new String("Hello");

        // System.out.println("Using == : " + (str1 == str2)); // Output: false
        // System.out.println("Using .equals() : " + str1.equals(str2)); // Output: true

        // // Integer Caching is an internal memory optimization where the JVM 
        // // reuses the same Integer object instances for small numbers 
        // // instead of instantiating new ones.
        // // By default, Java caches all integer values from -128 to 127. 
        
        // Integer num1 = 100;
        // Integer num2 = 100;

        // System.out.println(num1 == num2); // Prints: true (Same memory reference)
        // System.out.println(num1.equals(num2)); // Prints: true (Same values)

        // Integer num3 = 200; 
        // Integer num4 = 200; 

        // System.out.println(num3 == num4); // Prints: false (Different memory references)
        // System.out.println(num3.equals(num4)); // Prints: true (Same values)

        // // POJO is a simple object containing only private fields, constructors, and 
        // // getters/setters. Frameworks like Spring and Hibernate rely on POJOs to map
        // // data to databases or JSON without complex overhead. (Plain Old Java Object)

        // // Rules for a Class to be a POJO
        // // No Inheritance from Predefined Classes
        // // No Implementation of Framework Interfaces
        // // No Framework Annotations

        // Employee emp = new Employee(101, "Alice", 75000.0);
        // System.out.println("Employee Name: " + emp.getName());

        // emp.setSalary(80000.0);
        // System.out.println(emp);
    }
}

// // POJO Example
// public class Employee {

//     private int id;
//     private String name;
//     private double salary;

//     public Employee() {
//     }

//     public Employee(int id, String name, double salary) {
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setSalary(double salary) {
//         this.salary = salary;
//     }

//     @Override
//     public String toString() {
//         return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//     }
// }