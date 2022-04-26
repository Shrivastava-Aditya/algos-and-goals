package algo.Java.Searching;

public class BinarySearch {
    public static boolean search(int[] arr,int target){
        int l = 0, r = arr.length;
        int m;

        if(!isSorted(arr)) return false;

        while(l<=r){
            m = l + (r - l) /2;
            if(arr[m] == target) return true;
            else if(arr[m] > target) r = m - 1;
            else if(arr[m] < target) l = m + 1;
        }
        return false;
    }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
