// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 8 (Tugas)
// Nama File    : Main.java

package Pertemuan8.Kupu;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        Ulat K;
        Data<Kupu> anu;

        // Inisialisasi objek
        K = new Ulat();
        anu = new Data<>();

        // Set dan get isi dari objek Data
        anu.setIsi(K);
        anu.getIsi().gerak(); // Output: ulat merayap

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak(); // Output: kepompong diam

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak(); // Output: kupu terbang
    }
}