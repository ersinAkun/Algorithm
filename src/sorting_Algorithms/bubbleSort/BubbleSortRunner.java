package sorting_Algorithms.bubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {

        int[]arr = {5,2,8,6,3,7,1,0,4,9};
        System.out.println("BubbleSort oncesi liste : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------");

        System.out.println("BubbleSort sonrasi liste : ");
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
