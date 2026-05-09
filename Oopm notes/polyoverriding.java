class Overriding{
    public int add(int a,int b){
        return a+b;
    }
}
class Overriding2 extends  Overriding{
    public int add(int a,int b){
        return a+b;
    }
}
class Overriding3 extends  Overriding{
    public int add(int a,int b){
        return a+b;
    }
}

public class polyoverriding {
    public static void main(String[] args) {
        Overriding a;
        a=new Overriding2();
       
        System.out.println( a.add(2, 8));

        a=new Overriding3();
        System.out.println(a.add(5, 6));
        
    }
}
