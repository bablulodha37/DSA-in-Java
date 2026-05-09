class shape{
    public void print(){
        System.out.println("print area:");
    }
}
class triangle extends shape{
    public void print(int l,int h){
        System.out.println(h*l/2);
    }
}
class area extends shape{
    public void print(double r){
        System.out.println(r);
    }
}
class lenght extends area{
    public void print(int l){
        System.out.println(l);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        lenght c1=new lenght();
        c1.print();
        c1.print(2.2);
        c1.print(2);

        triangle c2=new triangle();
        c2.print(2,3);
    }
}
