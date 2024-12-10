public class ReverseStr{
    public static void RevStr(int indx, String str, String newstr){
        if(indx < 0){
            System.out.println("New string in reverse is - " + newstr);
            return;
        }

        newstr = newstr + str.charAt(indx);

        // System.out.print(str.charAt(indx));
        RevStr(indx-1,str,newstr);
    }

    public static void main(String[] args){
        String str = "Hello World";
        int len = str.length()-1;
        RevStr(len,str,"");
    }
}