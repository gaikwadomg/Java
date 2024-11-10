public class BreakContinue{
    public static void main(String[] args){
        for(int i =0 ; i < 10; i++){

            if(i == 5){
                continue;

            }
            if (i == 8){
                break;
            }
            System.out.println(i);

        }

        // trying similar code with while loop
        int j =0;
        while( true){

            if(j==5){
                j = j+1;
                continue;
            }
        
            if(j ==10){
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}