package algo.Java.Sorting;

import java.util.*;

public class SelectionSort{
    /* 
    This is sorting algorithm which repeatedly finds the minimum element in the unsorted part of an array. 
    First it finds the minimum element in the unsorted array and then puts it into the sorted part.

    Walkthrough
    for this we need to find the index of minimum element of the unsorted list repeatedly.
    the job of the outer loop is to keep the track of sorted element after swapping. inside this loop we create another loop to find the local minimum element 
    once it is done we swap the elements by typical temp variable declaration. we come out of the loop. voila.

    */
    public SelectionSort(int[] arr){
        iterative(arr);
    }
    public ArrayList<Integer> iterative(int[] arr){
       
        for(int i=0;i<arr.length -1 ;i++){
            int index = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr){
            list.add(i);
        }
        return list;
        
    }
    
}