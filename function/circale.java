import java.util.*;

public class circale {

    public static void circumference(float radius){
        float pi=3.14159f;
        float total=2*pi*radius;
        System.out.print("circumference of a circle:"+total);
    }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        float radius=sc.nextInt();

        circumference(radius);
    }
    
}
