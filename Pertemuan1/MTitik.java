// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 1

package Pertemuan1;

public class MTitik {
    public static void main(String[] args) {
        //Membuat objek titik
        Titik t1 = new Titik(3,2);
        Titik t2 = new Titik(10,-6);
        Titik t3 = new Titik();

        //Menampilkan jumlah titik ada berapa, karena tadi kita membuat 3 titik ( Titik 1, Titik 2, dan Titik 3) maka hasil yang harusnya didapat adalah 3.
        System.out.println(String.format("Jumlah Titik: %d", Titik.getCounterTitik()));
        
        //Menampilkan absis dan ordinat masing masing titik
        System.out.println(String.format("\nTitik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t2 memiliki absis: %.1f dan ordinat: %.1f", t2.getAbsis(), t2.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki absis: %.1f dan ordinat: %.1f", t3.getAbsis(), t3.getOrdinat()));
    
        //Merubah Ordinat dan absis pada salah satu titik
        t1.setOrdinat(7);
        t2.setAbsis(6);

        //Menampilkan absis dan ordinat masing masing titik setelah dirubah
        System.out.println(String.format("\nTitik t1 memiliki absis: %.1f dan ordinat: %.1f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t2 memiliki absis: %.1f dan ordinat: %.1f", t2.getAbsis(), t2.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki absis: %.1f dan ordinat: %.1f", t3.getAbsis(), t3.getOrdinat()));
    }
}
