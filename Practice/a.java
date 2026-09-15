public class a {

    public static void main(String [] args){

        // // Hello World
        // System.out.println("Hello World");

        // // Integers
        // byte b = 5;
        // short s = 10;
        // int i = 2400;
        // long l = 2045986;
        // System.out.println(b + "," + s + "," + i + "," + l);

        // // Real Numbers
        // float f = 124.33f; // Single Precision
        // double d = 225.3393; // Double Precision
        // System.out.println(f + "," + d);

        // // Characters
        // char c = 'a';
        // System.out.println(c);

        // // Boolean
        // boolean bool = false;
        // System.out.println(bool);

        // // How to store binary or octal or hexadecimal numbers in integers
        // // Keywords Binary - 0b, Octal - 0, Hexadecimal - 0X
        // byte bin_a = 0b101;    
        // byte oct_a = 05;
        // byte hex_a = 0X1f;
        // System.out.println(bin_a);
        // System.out.println(oct_a);
        // System.out.println(hex_a);

        // // Scientific Notation using double
        // double scientific = 6.022e23; // 6.022 * 10 ^ 23
        // System.out.println(scientific);

        // // Compiler ignores underscores in values until and unless is is just before e in scientific 
        // // format or it is after e or . in scientific or decimal formats
        // int elf = 23_12_235;
        // System.out.println(elf);

         

    }
    
}

// JDK -> JRE -> JVM (Left to right concentric circular enclosure for what contains what)
// JDK - Java Development Kit
// JRE - Java Runtime Environment 
// JVM - Java Virtual Machine
// Flow of code : Java Source Code --javac(Compiler)--> Bytecode --JVM(Compiler/Interpreter)-->
//  Machine Code(0s or 1s)
// At start there was only interpreter for Bytecode to Machine Code comparison so that the code
//  starts running fast
// Nowadays JIT(Just In Time) Compiler used for optimizing code 
// The more commonly used code parts will be loaded by JIT and the lesser ones will be handled
//  by interpreter
// At the hardware level the JVM for each computer will differ because of separate ISA for separate
//  machines
// The Java Language is platform independent as it runs on JVM which if present will help Java code
//  get executed on any type of machine but JVM itself is platform dependent as it needs to follow
//  different set of instructions for different types of hardware architectures
// It is pretty secure as it runs the code in a separate sandbox as compared to the local environment
// Java is statically typed as we explicitly declare variable type during creation
// Primitive Data Types - Integer(byte, short, int, long), Real Number(float, double), Char, Bool
// Every number is signed in java(can represent negatives as well as positives)