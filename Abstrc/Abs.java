abstract class Animal{
    Animal(){
        System.out.println("this is a contrucater:");
    }
    abstract void walk(); // abtract function
    public void brethe(){
        System.out.println(" brethe in air:");
    }
}
class horse extends Animal{
    horse(){ 
        System.out.println("its constructer:");
    }

    public void walk(){
        System.out.println("horse walk 4 lags");
    }
}
class chikan  extends Animal{
    public void walk(){
        System.out.println("chikan walk 2 lags");
    }
}
public class Abs {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.brethe();
    }
}
