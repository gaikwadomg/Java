import java.util.Scanner;

public class ConditionalStatements{
    
    public static void main(String[] args){
        // creating sc scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age - ");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println("Able to vote ");
        else
            System.out.println("not able to vote");

    }
}