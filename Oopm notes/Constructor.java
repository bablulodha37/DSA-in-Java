class Bablu {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    Bablu() { // Default constructor
        System.out.println("Hello, I am Default constructor");
    }

    Bablu(int age, String name) {  // Parameterized constructor
        this.age = age;
        this.name = name;
    }

    Bablu(Bablu c2) { // Copy constructor
        this.age = c2.age;
        this.name = c2.name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Bablu c1 = new Bablu(); // Calls default constructor

        Bablu c2 = new Bablu(20, "Bablu"); // Calls parameterized constructor
        c2.printInfo();

        Bablu c3 = new Bablu(c2); // Calls copy constructor
        c3.printInfo();
    }
}
