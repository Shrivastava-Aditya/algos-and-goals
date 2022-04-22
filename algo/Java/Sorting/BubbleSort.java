package algo.Java.Sorting;

public class BubbleSort{
    public int[] iterative(int [] arr){
        
        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j<arr.length;j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        return arr;
    }

    // public int[] recursive(int [] arr){
        
    //     int arr;
    // }
}