//  A) Write a java program to display all the vowels from a given string.

import java.util.Scanner;

public class Vowel{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter input string :");
	String st = sc.nextLine();
	System.out.println("Vowels in given string are as follows : ");

	for(int i = 0 ; i < st.length() ; i++){

	char ch = st.charAt(i);
	ch = Character.toLowerCase(ch);

		if( ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println(ch);
		}

	}

		
	}

}