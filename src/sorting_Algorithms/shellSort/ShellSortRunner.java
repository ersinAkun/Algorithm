package sorting_Algorithms.shellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {7,5,4,1,9,3,2,2};
        System.out.println("ShellSort olmadan once Liste : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("---------------------------");
        System.out.println("ShellSort olduktan sonra Liste : ");
        ShellSort.shellSort(arr1);
        System.out.println(Arrays.toString(arr1));


    }
}
