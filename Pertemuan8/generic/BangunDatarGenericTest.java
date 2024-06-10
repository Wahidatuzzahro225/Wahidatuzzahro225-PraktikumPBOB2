package Pertemuan8.generic;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }
}
/* Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !

Tidak memengaruhi*/