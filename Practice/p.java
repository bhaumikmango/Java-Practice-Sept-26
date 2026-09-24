// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

public class p {
    public static void main(String[] args) {   
    // // System Class: A final class in java.lang that provides access to standard I/O 
    // // resources. It is auto-imported into every Java program.
    // // Streams of Data: Sequences of data flowing from a source to a destination. 
    // // Java handles I/O as Byte Streams (8-bit units) or Character Streams (16-bit Unicode units).
    //     try {
    //         System.out.print("1. Enter a single character using System.in.read(): ");
    //         int charAsInt = System.in.read();
            
    //         while (System.in.available() > 0) {
    //             System.in.read();
    //         }
            
    //         char actualChar = (char) charAsInt;
    //         System.out.println("Output (Integer Code): " + charAsInt);
    //         System.out.println("Output (Character): " + actualChar + "\n");
    //     } catch (IOException e) {
    //         System.out.println("An error occurred: " + e.getMessage());
    //     }

    // // System.err: A PrintStream object dedicated to outputting error messages. It is 
    // // separate from out to allow standard output redirection while keeping error messages visible.
    // // An abstract base class for reading raw bytes. (InputStream Hierarchy)
    // // An abstract base class for writing bytes.(OutputStream Hierarchy)

    // // System.in.read(): Reads the next single byte of data from the keyboard buffer. 
    // // It returns the ASCII value or -1 at the end of the stream.
    // // Reader vs. InputStream: InputStream handles raw bytes, whereas Reader classes 
    // // handle character streams (Unicode), making them essential for text processing.
    
    // // InputStreamReader: Acts as a Bridge. It converts the byte stream from
    // // System.in into a character stream, allowing Reader subclasses to process it.
    // // BufferedReader: Wraps a Reader to implement buffering, which stores large 
    // // chunks of data in memory to reduce expensive OS system calls, significantly 
    // // improving performance.
    
    // // BufferedReader vs. Scanner: BufferedReader is low-level, only reads strings/lines,
    // // and requires explicit type conversion. Scanner: Introduced in Java 1.5 (java.util 
    // // package), it provides tokenization and built-in methods to simplify parsing.
    //     try {
    //         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //         System.out.print("2. Enter a line of text using BufferedReader: ");
    //         String bufferedReaderInput = reader.readLine();
    //         System.out.println("Output: " + bufferedReaderInput + "\n");
    //     } catch (IOException e) {
    //         System.out.println("An error occurred: " + e.getMessage());
    //     }

    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("3. Enter a line of text using Scanner: ");
    //     String scannerInput = scanner.nextLine();
    //     System.out.println("Output: " + scannerInput);
    //     scanner.close();
    
    // // Performance Rule: BufferedReader is faster and more memory-efficient. 
    // // Use Scanner for simple, low-volume input, and BufferedReader for high-performance 
    // // needs like competitive programming.
    }
}