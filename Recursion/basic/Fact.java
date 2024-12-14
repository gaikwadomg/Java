import java.util.Scanner;
public class Fact{
    public static void FactFind(int i ,int fact){
        // 5! = 5 *4*3*2*1 = 120
        if(i <=0){
            System.out.println("Factorial of entered number is "+ fact);
            return;
        }
        fact = fact * i;
        i--;
        FactFind(i , fact);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter factorial number : ");
        int i = sc.nextInt();

        FactFind(i,1);
    }
}