// A) Write a java program to accept a number from user, if it zero then  throw user 
// defined Exception “Number Is Zero”, otherwise calculate the sum of first and last digit 
// of that number. (Use static keyword).  

import java.util.Scanner;
public class SumOfFirstAndLastDigit{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();

        try{
           num = 0;
        }
        catch(Exception e){ 
            System.out.println("Number Is Zero");
        }

    }
}