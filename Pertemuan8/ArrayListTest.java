package Pertemuan8;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        //Inisialisasi Arraylist yang hanya dapat berisi objk string
        ArrayList<String> strings = new ArrayList<String>();

        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        //menghapus elemen
        strings.remove("praktikum");

        //iterasi pada keseluruhan Arraylist
        for (String s : strings){
            System.out.print(s+"");

        }
    }
}
