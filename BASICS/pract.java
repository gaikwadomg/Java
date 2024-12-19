import java.util.*;
public class pract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n :");
        int n = sc.nextInt();
        int sum = 1;
        for(int i =1 ; i <= n ; i++){
            sum = sum + i ;
        }

        System.out.println("Sum of first n natural numbers is " + sum);

    }
}