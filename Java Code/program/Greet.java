// inputer user name and greet him 

import java.util.Scanner;

public class Greet{

	public static void main(String[] args){
	System.out.println("Enter your name :");

	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();

	System.out.println("Hello " + name.toUpperCase() + " nice to meet You!" );

	}



}
