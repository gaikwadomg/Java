public class hollowRectangle{
    public static void main(String[] args){
        int rows = 4 , col = 5;
        System.out.println("Java program for printing hollow rectangle -- ");

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                if(i==0 || j == 0 || i == rows-1 || j == col-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}