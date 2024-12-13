public class printSubsequence{
    public static void subSeq(String str , int idx , String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        // to be 
        subSeq(str , idx+1,newStr+currchar);
        // choose not to be 
        subSeq(str, idx+1, newStr);
    }
    public static void main(String[] args){
        String str = "abc";
        int index = 0;
        subSeq(str, index,"");
    }
}