// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2(Tugas Tambahan)

package Pertemuan2.TugasTambahan;

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    // Konstruktor
    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    // Metode untuk menghitung volume prisma segitiga
    public double hitungVolume() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    // Metode untuk menghitung luas permukaan prisma segitiga
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double kelilingAlas = 3 * alas.getAlas();
        return (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
    }
}
