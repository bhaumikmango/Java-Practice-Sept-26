final class Student {
    private final String name;
    private final int id;
    private final String[] courses;

    public Student(String name, int id, String[] courses) {
        this.name = name;
        this.id = id;
        
        this.courses = (courses == null) ? new String[0] : courses.clone();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String[] getCourses() {
        return this.courses.clone();
    }
}


public class q {
    public static void main(String[] args) {
        String[] initialCourses = {"Math", "Science"};
        
        // Create an immutable student object
        Student student = new Student("Alex", 101, initialCourses);
        
        // Attempting to break immutability from the outside:
        initialCourses[0] = "Hacked";
        student.getCourses()[1] = "Hacked";

        // Verifying the object state remained completely safe
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Course 1: " + student.getCourses()[0]); 
        System.out.println("Course 2: " + student.getCourses()[1]); 
    }
}
