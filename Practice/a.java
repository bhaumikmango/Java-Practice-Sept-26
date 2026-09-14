public class a {

    public static void main(String [] args){

        System.out.println("Hello World");

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