import java.util.*;

public class function {

    public static void Printname(String name){
        System.out.print("Your name is:"+name);
        return;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.next();

        Printname(name);
    }
}