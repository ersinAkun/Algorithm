package sorting_Algorithms.quickSort;

import java.util.Arrays;

public class QuickSortRunner {
    public static void main(String[] args) {
        int[] arr1= {25,11,43,67,91,55,15,82};
        System.out.println("QuickSort oncesi liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------");
        System.out.println("QuickSort sonrasi liste : ");
        QuickSort.quickSort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------");


    }
}
