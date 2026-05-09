class pen {
    String color; //properties of pen class
    String type;

    public void write(){
        System.out.println(" wirtten something:");
    }
    public void printcolor(){
        System.out.println(this.color);  // this -> print color
    }
} 
 class Students {
        String name;
        int age;

        public void studentinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Students(){// with out perameter conscter
            System.out.println("students counter called");
        }
    
}

public class objclass { // class ka naam captal hona chaiye or function ka small
    
    public static void main(String[] args) {
        pen pen1=new pen(); // define 
        pen pen2=new pen();

        pen1.color="blue"; //given color 
        pen1.type="gel";  //type

        pen2.color="red";
        pen2.type="balliboll";

        pen1.printcolor(); // print color & calling function
        pen2.printcolor();


        Students s1=new Students();   // define class

        s1.name="bablu lodha";
        s1.age=22; // define age

        s1.studentinfo(); // calling 

    }
}
