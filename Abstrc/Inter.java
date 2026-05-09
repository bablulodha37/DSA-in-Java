interface Animal{
     void walk(); // ismai functn ko public nhi karte

}
interface loin{
    // void walk(); 
     default void walk() {
        System.out.println("Loin walking");
    }
}
class dog implements Animal,loin{
    public void walk(){
         loin.super.walk(); // output mai lane ke liye  loin interface ko
        System.out.println("slow walk");
    }
}
public class Inter{
    public static void main(String[] args) {
        dog d1=new dog();
        d1.walk();
    }
}