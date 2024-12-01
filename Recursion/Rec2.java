public class Rec2{

    public static void printSum(int n, int sum){
        if(n <1){
            System.out.println(sum);
            return ;
        }
        sum = sum + n;
        printSum(n-1, sum);
    }
    public static void main(String[] args) {
        int n = 11;
        int sum = 0;

        printSum(n,sum);
        // System.out.println(printSum(n,sum));
    }
}