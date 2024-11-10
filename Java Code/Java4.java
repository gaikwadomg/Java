// A)  Write a java program to display alternate character from a given string.[15 M] 

import java.util.Scanner;
public class Java4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String ch = sc.nextLine();

        for(int i = 0 ; i < ch.length() ; i = i + 2){

            System.out.println(ch.charAt(i));

        }
    }

}
