// import java.util.Arrays;
import java.util.Arrays;

public class Arrays{
    public static void main(String[] args){
        /**
         * Arrays:
         * declaring -- if we dont know values that need to be stored in array that is if user gives input then you need to use new keyword for same othervise no need to use new keyword .
         * 
         * int[] arr = {100,34,45,77} or
         * int[] arr = new int[3];
         * 
         * initialization
         * arr[0]=100;
         * arr[1]=33;
         * arr[2]=334;
         * arr[3]=45;
         * 
         * Array Functions 
         * 1..length
         * 2.sort()
         * 
         * 2d arrays -- 
         * 
         * initialization $ declaration
         * int[][] finalmark = {{44,66,77 } , {77,88,99}}
         * 
         * using 
         * System.out.println(finalmarks[0][0]);
         * 
         * 
         * 
         */

        int[] arr = {2,1,6,88,45};

        // length function
        System.out.println(arr.length);


        // Arrays.sort(arr); function 
        int[] arra = new int[3];
        arra[0]=3;
        arra[1]=1;
        arra[2]=5;

        Arrays.sort(arra);
        System.out.println(arra[0]);
    }
}