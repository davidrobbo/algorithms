/*
Linear search and Binary search provide two alternative methods
to identify whether an item exists in an array/the index of
the item in the array. Linear search's worst case run time
is equal to n, where n equals the amount of items in the
array. Binary search however, halves the array in size
per inspection, and the amount of runs in order to
identify the key is expressed as log2 n (that is,
log base 2 of n where n is equal to the amount of
items in the array [what power must 2 be raised
to, to get to n])
*/

public class BinarySearch {

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = (hi + lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int a = BinarySearch.indexOf(arr, 1);
        int b = BinarySearch.indexOf(arr, 27);
        int c = BinarySearch.indexOf(arr, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
