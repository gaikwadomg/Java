
// Fabonacci series A)  Write a Java program to display Fibonacci series using function.     [15 M] 

public class Fibo{
    public static void Fibonacci(){
        int a,b,c;
        a = 0;
        b = 1;
        c = 1;
        for(int i = 0 ; i < 20; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            

        }
    }

    public static void main(String[] args){
        Fibonacci();
    }
}