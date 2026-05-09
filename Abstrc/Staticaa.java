class Students {
    static String school;   // static variable shared by all objects
    String name;            // instance variable, unique per object
    
    public static void changename() {
        school = "oist";   // modifies the static variable
    }
}

public class Staticaa {
    public static void main(String[] args) {
        Students s1 = new Students(); // create object s1
        Students.school = "oct";      // assign value to static variable
        s1.name = "bablu";            // assign value to instance variable
        Students.changename(); // if use then print oist
        System.out.println(Students.school); // prints static variable
    }
}
