/**
 * Created by david on 11/02/2017.
 *
 * Insertion sort is an alogrithm best used
 * when the dataset being sorted is small.
 * It functions much like the way a player
 * would sort their hand (picking an item,
 * scanning the list, and inserting where
 * correct).
 * It's worst case running time is equal a triangular number equal to
 * (n * (n+1)) / 2.
 * It is inferior to to more complex algortihm as it's order of growth
 * far exceeds others
 */
public class InsertSort {

    public static void main(String[] args)
    {
        int[] inputOne = new int[]{ 44, 55, 23, 78, 9, 22 };
        int[] inputTwo = new int[]{ 44, 55, 23, 78, 9, 22 };
        int[] inDown = InsertSort.insertionSortReverse(inputOne);
        int[] inUp = InsertSort.insertionSort(inputTwo);
        for(int a:inUp){
            System.out.println(a);
        }
        for(int a:inDown){
            System.out.println(a);
        }
    }

    public static int[] insertionSort(int[] input)
    {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

    public static int[] insertionSortReverse(int[] input)
    {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] > input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
