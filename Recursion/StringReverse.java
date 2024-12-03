public class StringReverse{
    public static void StrRev(String str, int indx){
        if (indx ==0){
            System.out.print(str.charAt(indx));
            return;
        }

        System.out.print(str.charAt(indx));
        StrRev(str,indx-1);
    }

    public static void main(String[] args){
        String s = "Hello";
        int idx = s.length()-1 ;

        StrRev(s,idx);
    }
}
