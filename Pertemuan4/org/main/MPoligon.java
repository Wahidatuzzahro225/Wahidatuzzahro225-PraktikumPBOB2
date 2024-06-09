package Pertemuan4.org.main;

import Pertemuan4.org.bangundatar.PersegiPanjang;
import Pertemuan4.org.bangundatar.Segitiga;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        Segitiga segitiga = new Segitiga(8, 4);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Jumlah Sisi Persegi Panjang: " + persegiPanjang.getJumlahSisi());

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Jumlah Sisi Segitiga: " + segitiga.getJumlahSisi());
    }
}
