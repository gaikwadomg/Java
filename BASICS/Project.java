
/**
 * number guessing game -->
 * 1. first generate a random number range in 0-100; --
 * 2. ask user to guess the number 
 * 3 . if user guess number is smaller then give tip number is too small
 * 4. if user guess number is greater then tip user number is too big 
 * 5 take input from user unless user guess correct number generated randomly;
 * 6 . if user is tired he can enter any negitive number to stop game and exit game ;
 * 7. on exit game display correct number and end progam 
 * 8. on correct guess by user greet user congracts your guess was correct,.
 */
import java.util.Scanner;
public class Project{
    public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    int guess = (int)(Math.random()*100);
    System.out.println("Random number is " + guess);

    System.out.println("Guess the number generated randomly by the system --> ");
    System.out.println("Enter your number : ");

    int num = sc.nextInt();
    while(num != guess){

        if(num < 0){
            System.out.println(" You LOOSE Correct number is " + guess);
            break;

        }

        if(num<guess){
            System.out.println("Number you entered is too small !");
            System.out.println("Enter again : ");
        }

        if(num > guess){
            System.out.println("Number you entered is too big!");
            System.out.println("Enter again : ");

        }


        num = sc.nextInt();
    }

    if(num == guess){
    System.out.println("BINGO Your Guess Is Correct !!!");
    System.out.println("YOU WIN !!!");
    }       
    System.out.println("END !!!");

    }
}