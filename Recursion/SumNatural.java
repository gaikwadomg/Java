import java.util.Scanner;
public class SumNatural{
    // Program of recursionn to print sum of first n natural numbers 

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum = sum +i;
            System.out.println("Sum of first "+ n + " natural numbers is - " + sum);
            return;
        }
        sum = sum+i;
        i++;
        printSum(i, n, sum);


    }
    public static void main(String[] args){
        System.out.print("Enter value for n to get sum of first n natural numbers - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(1 , n , 0);
    }
}