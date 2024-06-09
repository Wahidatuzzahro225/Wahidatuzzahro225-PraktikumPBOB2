package Pertemuan4.TugasTambahan.bk.main;

import Pertemuan4.TugasTambahan.bk.bukuFiksi.BukuFiksi;
import Pertemuan4.TugasTambahan.bk.bukuFiksi.BukuNovel;
import Pertemuan4.TugasTambahan.bk.bukuNonFiksi.BukuNonFiksi;
import Pertemuan4.TugasTambahan.bk.bukuNonFiksi.BukuAkademik;

public class Main {
    public static void main(String[] args) {
        BukuFiksi novel = new BukuNovel("Novel A", "Penulis A", "2020", "Fantasi", 300, 150000);
        novel.view();

        BukuNonFiksi bukuAkademik = new BukuAkademik("Buku Akademik A", "Penulis B", "2021", "Pendidikan", 500, 250000);
        bukuAkademik.view();
    }
}
