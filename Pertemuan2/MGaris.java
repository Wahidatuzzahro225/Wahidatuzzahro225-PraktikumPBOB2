// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2

package Pertemuan2;

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(1,2);
        Titik t2 = new Titik(5,6);

        Garis G = new Garis(t1, t2);

        Titik tAwal = G.getTitikAwal();
        Titik tAkhir = G.getTitikAkhir();
        System.out.println("Titik awal(" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ")");
        System.out.println("Titik akhir(" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")");

        System.out.println("Panjang Garis G = " + G.getPanjang());
        System.out.println("Gradien Garis G = " + G.getGradien());

        Garis GRefleksiY = G.getRefleksiY();
        System.out.println("Refleksi Y garis G = " + GRefleksiY.getGradien());
        
        System.out.println("Garis G tegak lurus dengan garis GRefleksiY = " + G.isTegaklurus(GRefleksiY));
    }
}
