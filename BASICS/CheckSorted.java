import java.util.Scanner;
public class CheckSorted{
    public static boolean CheckS(int arr[] , int indx){
        if(indx == arr.length-1){
            return true;
        }
        if(arr[indx]< arr[indx+1]){
            return CheckS(arr, indx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        // program to check weather array number list is sorted or not using recursive function 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.println("Enter interger for index -- " + i + " -- In an array -");
            arr[i] = sc.nextInt();
        }

        boolean s = CheckS(arr , 0);
        for(int i =0 ; i <= arr.length-1 ; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println(" \nIs array sorted and strictly increasing - "+s);
    }
}