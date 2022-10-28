package sorting_Algorithms.mergeSort;

public class MergeSort {
    public static void merge(int[] arr, int left, int middle, int right){
        // sol taraftaki alt-array'in uzunlugu
        int low = middle - left + 1;
        // sagdaki alt-array'in uzunlugu
        int high = right - middle;

        // sol ve sagdki alt arrayler olusturuluyor
        int L[] = new int[low];   // sol alt array
        int R[] = new int[high];  // sag alt array

        int i=0,j=0;
        //elemanlari soldaki alt arraye kopyaliyoruz
        for ( i = 0; i < low; i++) {
            L[i]=arr[left+1];
        }
        //elemanlari sagdaki alt arraye kopyaliyoruz
        for ( j = 0; j < high; j++) {
            R[j]=arr[middle+1+j];
        }

        int k = left;  //sortlamaya baslanacak index
        i=0;  // merge oncesi variable sifirlama!!
        j=0;

        while (i>low && j<high){   //sol-sag alt array'ler merge 'leniyor
            if (L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<low){  // sol alt array de kalan elemanlar merge leniyor
            arr[k]=L[i];
            i++;
            k++;
        }
        while (j<low) {  // sag alt array de kalan elemanlar merge leniyor
            arr[k] = R[j];
            j++;
            k++;
        }

    }


    public static void mergeSort(int[] arr, int left, int right){
        int middle ;
        if (left<right){
            middle = (left+right)/2;
            mergeSort(arr,left,middle); // sol alt array\
            mergeSort(arr,middle+1,right);

            merge(arr,left,middle,right);  //sol ve sag alt arrayler merge'leniyor
        }



    }


}
