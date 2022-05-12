package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06Lmbd_Cozuldu {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        //1. yol Lambda cozumu
int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};



Arrays.stream(arr).forEach(System.out::print);
        System.out.println("");
Arrays.stream(arr).distinct().sorted().forEach( System.out::print);
        System.out.println("");

       // tekrarsizList.stream().map(t->t.).distinct().forEach(System.out::println);

        //2. yol
        List<Integer> tekrarsizList=new ArrayList<Integer>();
        for (Integer sayi:arr
             ) {
            if (!tekrarsizList.contains(sayi)){//eleman yoksa add ile tekrarsiz liste ekle eleman varsa ekleme gec
                tekrarsizList.add(sayi);
            }


        }
        Collections.sort(tekrarsizList);
        int tekrarsizArray[]=new int[tekrarsizList.size()];//tekrarsizList.size() kadar length olan bos array atandi

        for (int i = 0; i <tekrarsizList.size() ; i++) {
            tekrarsizArray[i]=tekrarsizList.get(i);

        }
        System.out.println("her elemandan bir tane olan arra= "+ Arrays.toString(tekrarsizArray));
    }

}
