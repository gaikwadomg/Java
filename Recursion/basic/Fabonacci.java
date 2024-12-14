import java.util.Scanner;
public class Fabonacci{

    public static void FiboPrint(int i , int n , int first , int second ){
        if(i == n){
            return;
        }
        System.out.println(first);
        int temp = first;
        first = second;
        second = temp;
        i = i+1;
        FiboPrint(i ,n, first, second);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n fabonacci series - ");
        int n = sc.nextInt();

        FiboPrint(1, n,0 , 1);

    }
}