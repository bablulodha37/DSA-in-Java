import java.util.*;
  
public class voter {

    public static void vote(int age){
        if(age<18){
            System.out.print("You are not eligible for voting");
        }else if(age>18){
            System.out.print("You are eligible for voting");
        }else{
            System.out.print("You are eligible for voting now");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
       
        vote(age);

    }
}