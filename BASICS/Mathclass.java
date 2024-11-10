/**
 * To take input in java we need to create a scanner object using this line
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * 
 * also we need to import scanner class first in program 
 * import java.util.Scanner;
 */



// importing scanner class
import java.util.Scanner;
public class Mathclass{
    public static void main(String[] args){

        // Creating a new Scanner names sc 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two numbers here : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // to get maximum value out of two values we can use Math.max() function.
        System.out.println("Maximum number out of two numbers is : " + Math.max(num1,num2)); 

         // to get minimum value out of two values we can use Math.min() function.
        System.out.println("Minimum number out of two number is : " +Math.min(num1,num2)); 

        // To get any random number using math function we can use Math.random() function 
        System.out.println("Random Number generated is : " + (int)(Math.random()* 100));


    }
}