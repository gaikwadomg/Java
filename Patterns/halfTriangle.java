public class halfTriangle{
    public static void main(String[] args){
        int rows = 4 , cols = 4;
        System.out.println("Java program for half triangle -- ");

        for(int i = 0 ; i < rows ; i++){
            System.out.print("\t\t");
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("Java program for inverted half triangle -- ");

        for(int i = rows ; i > 0 ; i--){
            System.out.print("\t\t");
            for(int j = i ; j > 0 ; j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}