// program to get unique subsequences of string using hashSets .
// importing HashSet from Java.util package to get unique sets 
import java.util.HashSet;
public class uniqueSubSequence{
    public static void subSeq(String str , int idx , String newStr,HashSet<String> set){
        // base case if string length is equal to length of index  then return 
        if(idx == str.length()){
            // checking if set contains new string if yes then returns else add new string to set and print new string .  
            if(set.contains(newStr)){
                return;
            }
            else{
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }

        // getting current character of string using index 
        char currchar = str.charAt(idx);
        // calling function if character chooses to be in string 
        subSeq(str , idx+1,newStr+currchar,set);
        // choose not to be 
        subSeq(str, idx+1, newStr,set);

    }


    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        int index = 0;
        subSeq(str, index,"",set);
    }
}