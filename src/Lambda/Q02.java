package _10_List;

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

        List<String> list1=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        list1.add(2,"tuba");
        //1. yol Lambda ile cozum


        list1.
                stream().
                map(t -> t.toLowerCase(Locale.ROOT)).
                filter(t->t.contains("a")).
                forEach(System.out::println);

        // 2. yol
        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aolmayanIsimler=new ArrayList<>(); //a olmayan isimlerin atanacagi bos liste creat edildi

        for (String each:isimler
        ) {
            if (!each.toLowerCase(Locale.ROOT).contains("a")){
                aolmayanIsimler.add(each);
            }

        }

        System.out.println("2. yol "+"aolmayanIsimler: "+ aolmayanIsimler);




    }


}
