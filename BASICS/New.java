import java.util.Scanner;

public class New{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // add two number input from user 
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = num1 + num2;

        System.out.println("Addition of two numbers is : ");
        System.out.println(num3);
    }
}