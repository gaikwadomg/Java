public class firstAndLast{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str ,int indx, char ch){
        if(indx > str.length()-1){
            System.out.println("First occured at " + first + " and last at  " + last);
            return;
        }

        if(ch == str.charAt(indx)){
            if(first == -1){
                first = indx;
            }
            else{
                last = indx;
            }
           
        }
        findOccurance(str,indx+1,ch);

       

    }

    public static void main(String[] args){
        findOccurance("Hello",0, 'l');
    }
}