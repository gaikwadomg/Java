// A)  Write a java program to display following pattern: 
// 5 
// 4 5 
// 3 4 5 
// 2 3 4 5 
// 1 2 3 4 5

public class Java5{
    public static void main(String[] args){
        int num = 5;

        for(int i = num ; i > 0 ; i--){
            for(int j = i ; j <= num ; j++){
            
            System.out.print(i + " ");

            }
            System.out.println( );
        }

    }
}