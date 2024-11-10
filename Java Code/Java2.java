// 1. A) Write a java program to display all the vowels from a given string. [15 M] 

import java.util.Scanner;
public class Java2{
    public static void Display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String st = sc.nextLine();

        st = st.toLowerCase();

        for(char a = 0 ; a < st.length() ; a++){

            char ch = st.charAt(a);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
            System.out.println("Vowel " + st.charAt(a)+ " is present in string .");

            }
        }



    }

    public static void main(String[] args){
        Display();
    }
}
