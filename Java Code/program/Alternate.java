// alternate characters from string 

import java.util.Scanner;

public class Alternate{

	public static void main(String[] args){
		System.out.println("Enter a string :");

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		for(int i =0 ; i < str1.length() ; i = i+2){
			System.out.println(str1.charAt(i));
		}

	}

}