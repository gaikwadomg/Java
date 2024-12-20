public class reverseTriangle{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {

            // for loop for spaces 
            for(int j = i ; j < n-1 ; j++ ){
                System.out.print("   ");
            }

            // for loop for star
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" * ");
            }

            System.out.println("");

        }
    }
}