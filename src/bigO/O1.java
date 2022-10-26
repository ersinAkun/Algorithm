package bigO;

public class O1 {    //O(n)  --> O(1)  ( Constant Complexity ) ->time sabit!

    //verilen array in son elemanini
    // ekrana yazdirma
    public static void main(String[] args) {

        int[] arr = {1, 10, 23, 43, 77, 1234};  //6 eleman ama 6000 eleman da olsa, time ayni olur, sonuncuyu verir.
        System.out.println( arr[arr.length - 1]); //tek islem

        //baska bir ornek : verilen sayinin cift olup olmadigini kontrol edin

        int x=24;
        if (x%2==0) System.out.println("Cift");   //tek islem  -> O(1)



/*   ******* NOT
* Time Complexity: bir algoritmanın çalışması
için gerekli olan süre, saniyeleri hesaplayarak değil,
kaç tane işlem gerçekleştirdiğine göre hesaplamaktır


Big O Notation ==> O(n) :
bir algoritmanın performansını veya time-complexity
sini hesaplamak için kullanılır
 */

 /*
        int x = 3;
        int y = 5;
        for () {   // 1000 kez dondu   --> 1002 demeyiz, x ve y 1000'in yaninda cok kucuk old dan 1000 islem deriz
  */
    }


}
