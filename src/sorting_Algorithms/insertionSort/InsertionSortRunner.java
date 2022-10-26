package sorting_Algorithms.insertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {
        int[] arr1 ={12,9,4,99,120,1,3,10};
        System.out.println("InsertionSort oncesi Liste :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("-------------------------------");
        System.out.println("InsertionSort sonrasi Liste :");
        InsertionSort.insertonSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("-------------------------------");

    }
}
