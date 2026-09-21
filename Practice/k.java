// public class k {
//     public static void main(String[] args) {
//         // If we want to use a certain value in a class for multiple times 
//         // as the same value would be used in multiple instances of that object
//         // then we use static keyword
//         // This prevents more storage usage

//         // Student.College = "IMSEC";
//         Student s1 = new Student();
//         s1.name = "Bhaumik";
//         s1.RollNo = 15;
//         s1.age = 21;
//         System.out.println(s1.name + " of " + s1.age + " years of age studies in " + s1.College + " and his roll number is " + s1.RollNo);
//         Student s2 = new Student();
//         s2.name = "Tanush";
//         s2.RollNo = 45;
//         s2.age = 22;
//         System.out.println(s2.name + " of " + s2.age + " years of age studies in " + s2.College + " and his roll number is " + s2.RollNo);
//         // As the variable is common for all instances, changing it for
//         // a single instance, changes it for all
//         s2.College = "MAIT";
//         System.out.println(s1.name + " of " + s1.age + " years of age studies in " + s1.College + " and his roll number is " + s1.RollNo);
//         System.out.println(s2.name + " of " + s2.age + " years of age studies in " + s2.College + " and his roll number is " + s2.RollNo);

//         Random r1 = new Random();
//         System.out.println(r1.PI);

//         final int x;
//         x = 4;
//         // x = 5 will give an error
//         System.out.println(x);
//     }
// }

// class Student{
//     String name;
//     int age;
//     int RollNo;
//     // static used for the variable(It is the class's property)
//     static String College;

//     Student(){}

//     Student(String name, int age, int RollNo){
//         this.name = name;
//         this.age = age;
//         this.RollNo = RollNo;
//     }

//     // static block (Used to define static values all at once)
//     static {
//         College = "IMSEC";
//     }
// }

// class Random{
//     // Final keyword is used for variables which can be assigned only once
//     final double PI;
    
//     Random(){
//         this.PI = 3.14;
//     }
// }