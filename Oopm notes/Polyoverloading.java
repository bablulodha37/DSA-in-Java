class Overloading{
     String name;
    int age;

    public void print(){
        System.out.println("method overloadig");
    }
    public void print(String name){
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class Polyoverloading {
    public static void main(String[] args) {
    Overloading c1=new Overloading();
    c1.name="bablu lodha";
    c1.age=22;
    c1.print(c1.name, c1.age);

    }    
}
