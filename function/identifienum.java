import java.util.*;

public class identifienum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int positivenum=0,negative=0,zeronum=0;
        char choice;

        do{
            System.out.print("Enter your number:");
            int num=sc.nextInt();

            if (num>0){
                positivenum++;
            }else if(num<0){
                negative++;
            }else{
                zeronum++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice=sc.next().charAt(0);
        }while(choice=='y' || choice=='Y');
        
        System.out.println("...result...");
        System.out.println("positive number count:"+positivenum);
        System.out.println("negative  number count:"+negative);
        System.out.println("zero number count: "+zeronum);
    }
}
