import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        if (list.size()==1) {
            return true;
        } else if (list.get(0)>list.get(1)) {
            return false;
        } else {
            list.remove(0);
            return isSorted(list);
        }
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if (list.size()==i-1) {
            return true;
        } else if (list.get(i)>list.get(i+1)) {
            return false;
        } else {
            return isSortedRec(list, i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i, int j) {
        if (arr.length==i) {
            if (j==count) {
                return true;
            } else {
                return false;
            }
        } else if (arr[i]==x) {
            return hasCountCopiesRec(arr, x, count, i+1, j+1);
        } else {
            return hasCountCopiesRec(arr, x, count, i+1, j);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) { 
        if (lowerBound>upperBound) {
            return false;
        } else if (arr[lowerBound+(upperBound-lowerBound)/2]<num) {
            return binarySearchRec(arr, num, lowerBound+(upperBound-lowerBound)/2+1, upperBound);
        } else if (arr[lowerBound+(upperBound-lowerBound)/2]>num) {
            return binarySearchRec(arr, num, lowerBound, lowerBound+(upperBound-lowerBound)/2-1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(4);
        l1.add(4);
        int[] l2 = {1, 5, 5, 2};
        int[] l3 = {1, 3, 4, 6, 8};
        System.out.println(isSorted(l1));
        System.out.println(hasCountCopies(l2, 5, 2));
        System.out.println(binarySearch(l3, 6));
    }
}
