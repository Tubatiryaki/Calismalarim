package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03Lmbd_Cozuldu {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<Integer> sayi=new ArrayList<>(Arrays.asList(2,3,4,6,7));
        System.out.println(sayi.stream().map(t -> t * t).reduce(Integer::sum));


    }
}
