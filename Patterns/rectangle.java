public class rectangle{
    public static void main(String[] args){
        System.out.println("java program to print rectangle star pattern -- ");
        int row = 4 , col = 5;

        for(int i = 0 ; i < row ; i++){
            
            System.out.print("\t \t");

            for(int j = 0 ; j <col ; j++){
                System.out.print(" * ");
            }

            System.out.println("");
        }
    }
}