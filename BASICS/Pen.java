import java.util.Scanner;

public class Pen{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    // pen = 10 rs , book = 40 rs
    System.out.println("Enter your amount : ");
    int amt = sc.nextInt();
    
    if(amt < 10){
        System.out.println("Cannot get anything");

    }
    else if(amt >= 10 && amt < 40){
        System.out.println("Can get only pen");
    }
    else if(amt == 40 || amt < 40){
        System.out.println("can get a pen or book");
    }
    else if(amt >= 50 ){
        System.out.println("can get both ");
    }

    }

}