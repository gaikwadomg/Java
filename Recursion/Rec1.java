public class Rec1{
    public static void printNumbers(int x){
        System.out.print(x+" ");
        if(x == 5){
            return;
        }
        printNumbers(x+1); 
    }
    public static void main(String[] args) {
        int x = 1;
        printNumbers(x);
    }
}