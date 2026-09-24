// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

public class o {
    public static void main(String[] args) {
        // // Nested Classes : 4 types
        // // Static, Inner, Local, Anonymous Class
        // // Used for logical grouping, better access to outer class

        // Outer outer = new Outer();
        // Outer.Inner inner = new Outer.Inner(outer);
        // inner.fun();

        // // Anonymous Class
        // // an inner class that is declared and instantiated at the same 
        // // time without being given an explicit name. 
        // List<String> names = new ArrayList<>(List.of("Elephant", "Cat", "Giraffe"));
        // Collections.sort(names, new Comparator<String>() { 
        //     @Override
        //     public int compare(String s1, String s2) {
        //         return Integer.compare(s1.length(), s2.length());
        //     }
        // });

        // Outer1 outer1 = new Outer1();
        // outer1.greet();
    }
}

// // Static Nested Class
// class Outer{
//     private static int x = 4; // Only static variables can be accessed by inner static class
//     int y;

//     static class Inner{ // Can inherit or implement classes or interfaces just like any other class
//         Outer outer;

//         Inner(Outer outer){
//             this.outer = outer;
//         }

//         void fun(){
//             System.out.println(x);
//             System.out.println(outer.y);
//         }
//     }
// }

// // Final Class 
// // a nested class defined inside a block of code, typically within a 
// // method body, constructor, or initialization block.
// class Outer1{
//     void greet(){
//         class Local{
//             void sayHello(){
//                 System.out.println("Hello");
//             }
//         }
//         Local local = new Local();
//         local.sayHello();
//     }
// }
// // Effective final rule: Any variable in a final class's scope should be final(unchangeable)