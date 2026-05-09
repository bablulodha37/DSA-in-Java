import java.util.*;
class ifelse{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int button=sc.nextInt();



        
        // System.out.print("Enter a:");
        // int a=sc.nextInt();
        // System.out.print("Enter b:");
        // int b=sc.nextInt();

        // if(a==b){
        //     System.out.println("a equal to b");
        // }else if(a>b){
        //     System.out.println("a is grether and b is lesser");
        // }else{
        //     System.out.println("b is grether and a is lesser ");
        // }


        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("hiii");
            break;
            case 3:System.out.println("hmmm");
            break;
            default:System.out.println("invailid");
        }
    }
}