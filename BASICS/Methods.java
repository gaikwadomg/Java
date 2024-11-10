

// methods / functions in java 

public class Methods{

    // we declare methods in outside of main class 
    public static void p1(String x){
        System.out.println(x);
    }

    public static void hello(){
        System.out.print("This method prints hello !");
    }

    public static void sum2(int p ,int q){
        System.out.println(p+q);
    }

    public static void main(String[] args){
        p1("I can print using methods");
        hello();
        sum2(5,-7);
    }
}