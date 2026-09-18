public class g {
    public static void main(String[] args) {
        // // Function Overloading (How to use same name
        // // functions differently on the basis of arguments)
        // System.out.println(sum(2, 3));
        // System.out.println(sum(4, 5));
        // System.out.println(sum(3, 4, 5));
        // greet(22, "Bhaumik");
        // greet("Bhaumik", 22);

        // // Chaining of Functions

        // // Recursion (Calling of a function by itself)
        // System.out.println(fib(5)[4]);
        // System.out.println(fib_r(5)[4]);
    }
    // static int sum(int a, int b){
    //     return (a + b);
    // }
    // static int sum(int a, int b, int c){
    //     return (a + b + c);
    // }
    // static void greet(String name, int age){
    //     System.out.println("Hello " + name + "I got to know you're " + age);
    // }
    // static void greet(int age, String name){
    //     System.out.println("Hello " + name + "I got to know you're " + age);
    // }
    // static int[] fib(int n){
    //     int[] out = new int[n];
    //     int a = 0;
    //     int b = 1;
    //     for (int i = 0; i < n; i++) {
    //         out[i] = a;
    //         b = b + a;
    //         a = b - a;  
    //     }
    //     return out;
    // }
    // static int[] fib_r(int n) {
    //     if (n <= 0) return new int[0];
    //     int[] out = new int[n];
    //     generateFib(out, n, 0, 0, 1);
    //     return out;
    // }

    // private static void generateFib(int[] out, int n, int index, int a, int b) {
    //     if (index == n) {
    //         return;
    //     }
    //     out[index] = a;        
    //     generateFib(out, n, index + 1, b, a + b);
    // }

}
