// A) Write a ‘java’ program to check whether given number is Armstrong or not. 
//      (Use static keyword) 
// 153 1^3 + 5 ^3 + 3 ^3 = 153

import java.util.Scanner;
public class Java3{

    public static void Armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number :");
        int number = sc.nextInt();

        int digit = 0;

        for(int i = number ; i != 0 ; i = i/10 ){
            digit = digit + 1;
        }

        int j = number;
        int sum = 0;
        int rem = 0 ; 
        

        while(j != 0){
            rem = j % 10;
            sum = sum + (int)Math.pow(rem , digit);
            j = j / 10;
        }

        if(sum == number){
            System.out.println(" Is Armstrong");
        }
        else{
            System.out.println("Not Armstrong ");
        }

    }


    public static void main(String[] args){
        Armstrong();
    }
}

