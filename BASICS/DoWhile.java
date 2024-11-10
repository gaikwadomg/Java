/** Q. enter number form user and print it on screen unless user enters a negitive number. using do while */

import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do{
            System.out.println("Input a number :");
            num = sc.nextInt();
            System.out.print("Here is your number :");

            System.out.println(num);

        }while(num > 0);

        System.out.println("END");

    }
}