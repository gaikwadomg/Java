import java.util.Scanner;

public class RemoveDuplicate{
    public static boolean[] map = new boolean[26];

    public static void Remove(String str , int index , String newStr){

        if(index == str.length()){
            System.out.println("String Without duplicates is - "+ newStr);
            return;
        }

        char ch = str.charAt(index);
        if(ch != ' '){

            if( map[ch-'a'] == false ){
                newStr = newStr + ch;
                map[ch-'a'] = true;
                Remove(str, index+1, newStr);
            }
            else{
                Remove(str, index+1, newStr);
            }

        }
        else{
            Remove(str, index+1, newStr);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string you want to remove duplicates -- ");
        String s = sc.nextLine();
        int index = 0;

        Remove(s, index, "");
    }
}