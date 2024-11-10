// ) Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword) 

import java.util.*;

public class ArmstrongCheck{

	 public static void main(String arg[]){
 	 int check,rem=0;
 	 int sum=0,num;
 	 
     System.out.println("enter the number to check armstrong or not");
 	 
     Scanner sc=new Scanner(System.in);
 	 num = sc.nextInt();
  	 check=num;
     int count = 0 ;

 	 while(check!=0){
        rem=check%10;
        sum=sum+(rem*rem*rem);
        check=check/10;
     }

    if(num==sum)
    System.out.println("the number is armstrong");
    else
    System.out.println("the number is not armstrong");
    }


}