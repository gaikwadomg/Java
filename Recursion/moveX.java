public class moveX{

    public static void moveXToLast(String str, int indx , int count , String newstr){

        if(indx == str.length()){
            for(int i = 0 ; i < count ; i++){
                newstr = newstr + 'x';
            }
            System.out.println(newstr);
            return;
        }

        if (str.charAt(indx) == 'x'){
            count = count +1;
            moveXToLast(str , indx+1, count , newstr);
        }
        else{
            newstr = newstr + str.charAt(indx);
            moveXToLast(str , indx+1, count , newstr);
        }



    }
    public static void main(String[] args){
        String str = "aaxxkkkkxa";
        int indx = 0;
        String newstr = "";
        moveXToLast(str, indx , 0 , newstr);
    }
}