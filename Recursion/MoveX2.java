// program to move x at the end of the string 
public class MoveX2{
    public static void Move(String str, int indx , String newStr , int Count){
        if(indx == str.length()){
            for(int i = 0 ; i < Count ; i++){
                newStr = newStr + 'x';
            }
            System.out.println("New string - " + newStr);
            return;
        }
        
            if(str.charAt(indx) == 'x'){
                Move(str , indx+1 , newStr ,  Count+1);
            }
            else{
                newStr = newStr + str.charAt(indx);
                Move(str , indx+1 , newStr ,  Count);
            }
    }
    public static void main(String[] args){
        Move("aaaxbbbxxcc",0, "" , 0);
    }
}