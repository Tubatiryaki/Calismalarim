package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q01 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        //1. yol Lambda ile cozum
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        list1.add(2, "tuba");

        list1.
                stream().
                map(t -> t.toLowerCase(Locale.ROOT)).
                filter(t -> t.contains("a")).
                forEach(System.out::println);
    }
}
