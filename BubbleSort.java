import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 13/02/2017.
 */
public class BubbleSort {

    /*
    1 for i = 1 to A:length - 1
    2 for j = A:length down to i - 1
    3 if A[j]  < A[j-1]
    4 exchange A[j]  with A[j-1]
     */

    public static void main(String[] args)
    {
        int[] arr = { 2, 6, 2, 5, 4, 88, 22};
        ArrayList<Integer> a = new ArrayList<>();
        for(int b:arr)
        {
            a.add(b);
        }
        List<Integer> list = BubbleSort.sort(a);
        for(int z:list)
        {
            System.out.println(z);
        }
    }

    public static List<Integer> sort(List<Integer> arr)
    {
        int n = arr.size();
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr.get(j-1) > arr.get(j)){
                    //swap elements
                    temp = arr.get(j-1);
                    arr.set(j-1, arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        return arr;
    }
}
