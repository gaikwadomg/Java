// printing the subsequences of keypad string 

public class keypad{
    public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    public static void printSequences(String str, int idx , String combination){
        // basecase
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        // logic 
        // getting current character ie 2 first 
        char ch = str.charAt(idx);
        String map = keypad[ch-'0'];

        for(int i =0; i < map.length(); i++){
            printSequences(str, idx+1, combination + map.charAt(i));
        }

    }

    public static void main(String[] args){
        // if specific number is entered by user corresponding combination of keypad characters should be printed on the screen 
        String str = "23";
        int index = 0;
        printSequences(str,index,"");
    }
}