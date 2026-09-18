public class f {
    public static void main(String[] args) {
        // Functions
        greet();
        sayHello(33);
        int a = numberTwo();
        System.out.println(a);
        String f = message("We Won ");
        System.out.println(f);
    }

    // No input No output
    static void greet(){
        System.out.println("Hello World");
    }

    // input but no output
    static void sayHello(int a){// No. of parameters can be anything
        System.out.println(a);
    }

    // No input but output
    static int numberTwo(){
        return 2;
    }

    // Input and Output both
    static String message(String s){
        String a = s + "yayyy";
        return a;
    }
}
