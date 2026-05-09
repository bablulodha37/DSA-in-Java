// package Accessmodi;

 class InnerAceessa {

    String gmail_logo;// access all classes and same package
    public String name;// access all classes
    protected String email;//access sub classes

    private int password; //access only self class

   public int getpassword(){ //private ko use karna other class to use getter and setter
    return password;
   }

   public void setpassword(int pass){
    this.password=pass;
   }

}
public class accessa {
    public static void main(String[] args) {
        InnerAceessa s1=new InnerAceessa();
        s1.name="bablu lodha";
        s1.gmail_logo="picture";
        s1.email="bablulodha37@gmail.com";
        s1.setpassword(1325252);
        System.out.println(s1.getpassword());

    }
}