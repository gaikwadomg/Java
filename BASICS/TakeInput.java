// Importing scanner class for taking input 
import java.util.Scanner;

public class TakeInput{
    public static void main(String[] args){

        // Creating scanner object named sc using new keyword
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        // taking input in variable of type int using scanner sc.nextInt(); 
        int age =sc.nextInt();
        System.out.println( "My age is --> " + age);

        System.out.println("Enter your Name :");
        // taking single wors as input in java using sc.next() function
        String name = sc.next();
        System.out.println("My name is : " + name);

        // to enter whole string as input you need to use sc.nextLine(); function 
        System.out.println("Enter name again : ");
        String name1 = sc.nextLine();
        System.out.println("My whole name is  : " + name1);

    }
}