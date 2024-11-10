// ) Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword) 

import java.util.*;

public class Armstrong{

	public static void mainString[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a Number to check :");
	int num = sc.nextInt();

	// armstrong number is a number rased to its power of number of digits og=f nubber and their sum is the original number itself


	// eg 1 153 is an Armstrong number because (1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153).
	//rase value 
	int raise = 0;

	while(num !=0){
		raise = raise + 1;
	}

	System.out.println(raise);

	
	

	}


}