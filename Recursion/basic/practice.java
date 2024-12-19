// print all the prmutations of the string [all possible combination of letters] 
// eg - "abc" permutations - [ abc , acb , bac , bca , cab , cba] 

public class practice{
    public static void permute(String str  , String combi){

        // base case 
        if(0 == str.length()){
            System.out.println(combi);
            return;
        }

        for(int i =0 ; i < str.length(); i++){
            // get current character 
            char ch = str.charAt(i);
            String str2 = str.substring(0,i) + str.substring(i+1);
            permute(str2,combi+ch);
        }
    }

    public static void main(String[] args){
        String str = "abc";
        int idx =0;
        permute(str, "");
    }
}