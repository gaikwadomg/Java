public class SelectionSort{
    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22};

        // time complexity = O(n^2)
        // Selection sort
        for(int i = 0 ; i < arr.length-1 ; i++) {
            int min = i;
            for(int j = 1+i; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        printArr(arr);
    }
}