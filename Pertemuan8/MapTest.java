package Pertemuan8;

import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        //kunci -> int, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        
        //nambah elemen
        map.put(1,"satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        
        //ambil elemen pertama
        System.out.println(map.get(1));

        //ambil seluruh kunci sebagai collection set
        Set<Integer> key = map.keySet();

        //tugas PBO(tampilkan seluruh nilai menggunakan iterasi)
        for(Integer Keys: key){
            System.out.println(Keys + "." + map.get(Keys));
        }
    }
}
