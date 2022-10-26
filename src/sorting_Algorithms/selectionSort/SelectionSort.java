package sorting_Algorithms.selectionSort;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int min;
        int temp;
        int i=0;
        for (; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            //swap islemi
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
    }


}
/*
Tanım : ilk elemandan son elemana kadar her elemanı kendinden sonra gelen, kendinden
küçük elemanların en küçüğü ile yer değiştirme işlemidir.

      { 1 , 2 , 3, 10 , 6 , 4 , 7 }  --> sıralıyalım


Time Complexity : En kötü durumda O(n2) zaman alıyor , zaman açısından verimsiz,
ama en avantajlı tarafı bellek kullanımı O(1) , ekstra bir tane temp değişkene
ihtiyaç duyduğu için
 */