import java.util.Scanner;

public class SwitchStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Conditional statement 
        System.out.println("Enter numbers from 1 to 7 for days of weak :");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wed - Sat");
                break;

        }


    }
}