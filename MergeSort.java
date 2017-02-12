package com.algortihms.mergesort;

/* The merge sort has a much lower order of growth
than the insertion sort. It is based on the on
the divide and conquer approach to algorithms.
We divide the main problem into smaller
sub-problems which each resemble the main problem.#
We then conquer the sub-problems. Finally, we merge the
solved sub-problems to complete the sub-problem*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 12/02/2017.
 */
public class MergeSort {

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ar = {9, 4, 2, 6, 1, 7, 0, 10};
        for(int a: ar){
            arr.add(a);
        }

        ArrayList<Integer> arrS = MergeSort.mergeSort(arr);
        System.out.print(arrS);
    }

    protected static ArrayList<Integer> mergeSort(ArrayList<Integer> arr)
    {
        if(arr.size() < 2){
            return arr;
        }
        int mid = (int) Math.round(arr.size()/2);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = 0; i < mid; i++){
            left.add(arr.get(i));
        }
        for(int j = mid; j < arr.size(); j++){
            right.add(arr.get(j));
        }
        return MergeSort.merge(mergeSort(left), mergeSort(right));
    }

    protected static ArrayList<Integer> merge(ArrayList<Integer> arr, ArrayList<Integer> arrTwo)
    {
        ArrayList<Integer> result = new ArrayList<>();

        while(arr.size() > 0 && arrTwo.size() > 0){
            if(arr.get(0) <= arrTwo.get(0)){
                result.add(arr.get(0));
                arr.remove(0);
            } else {
                result.add(arrTwo.get(0));
                arrTwo.remove(0);
            }
        }

        while(arr.size() > 0){
            result.add(arr.get(0));
            arr.remove(0);
        }
        while(arrTwo.size() > 0){
            result.add(arrTwo.get(0));
            arrTwo.remove(0);
        }

        return result;
    }
}
