import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of times :");
        // int num = sc.nextInt();

        // for loop
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }

        // Wlile loop for printing 1-10
         int j = 1;
         while(j<=10){

            System.out.println(j);
            j++;

         }

         // do while loop
         int m =1;
         do{
            System.out.println(m);
            m++;
         }while(m<=10);
    }
}