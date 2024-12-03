// in Bubble sort largest element is pushed to the end of array until whole array is sorted .

public class BubbleSort{

    // print function 
    public static void printArr(int arr[]){
         for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int arr[] = {8 , 20 , 1 , 11 , 12};
        // Time complexity = O(n^2);
        // Bubble Sort 
        for(int i = 0 ; i <= arr.length-1 ; i++){
            for(int j = 0 ; j < (arr.length-i-1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }           
        }

        printArr(arr);

       
    }
}
