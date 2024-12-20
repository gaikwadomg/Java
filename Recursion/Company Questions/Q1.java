// print all the prmutations of the string [all possible combination of letters] 
// eg - "abc" permutations - [ abc , acb , bac , bca , cab , cba] 

public  class Q1{
    public static void permutations(String str  , String combi){
        // basecase 
        if(0 == str.length()){
            System.out.println(combi);
            return;
        }
        

        // logic for printing permutations
        for(int i = 0 ; i < str.length() ; i++){
            // getting current character 
            char current = str.charAt(i);

            String str2 = str.substring(0,i) + str.substring(i+1);
            permutations(str2,combi+current);
        }
    }

    public static void main(String[] args){
        String str = "abc";
        permutations(str,"");
    }
}