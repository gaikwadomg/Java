import java.util.Scanner;
public class BaseCls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number for table: ");
        int a = sc.nextInt();

        System.out.print("Enter string :");
        String b = sc.next();


        // System.out.println(a);
        System.out.println(b);

        for(int i = 1 ; i <=10 ; i++){
            System.out.println(i*a);
        }


    }
}