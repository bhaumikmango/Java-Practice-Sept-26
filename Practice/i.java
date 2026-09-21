// public class i {
//     public static void main(String[] args) {
//         // Constructor Overloading
//         student s1 = new student("Bhaumik", 22, 122, "IMSEC");
//     }
// }

// class student{
//     String name;
//     int age;
//     int rollNumber;
//     String college;

    // Without Constructor Chaining
    // student(){}

    // student(String name){
    //     this.name = name;
    // }

    // student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    // student(String name, int age, int rollNumber){
    //     this.name = name;
    //     this.age = age;
    //     this.rollNumber = rollNumber;
    // }


//     // With Constructor Chaining
//     student(){
//         this("Unknown", 0, 0, "Unknown");
//     }

//     student(String name){
//         this(name, 0, 0, "Unknown");
//     }

//     student(String name, int age){
//         this(name, age, 0, "Unknown");
//     }

//     student(String name, int age, int rollNumber){
//         this(name, age, rollNumber, "Unknown");
//     }

//     student(String name, int age, int rollNumber, String college){
//         this.name = name;
//         this.age = age;
//         this.rollNumber = rollNumber;
//         this.college = college;
//     }

//     void markAttendance(){
//         System.out.println("Attendance marked for " + name);
//     }
    
//     void print() {
//         System.out.println("Name " + name + "; Age " + age + "; Roll Number " + rollNumber + "; College Name " + college);
//     }
// }