// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2 (Tugas Tambahan)

package Pertemuan2.TugasTambahan;

public class Segitiga { 
    private double alas;
    private double tinggi;

    // Konstruktor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Getter untuk alas
    public double getAlas() {
        return alas;
    }

    // Getter untuk tinggi
    public double getTinggiSegitiga() {
        return tinggi;
    }

    // Metode untuk menghitung luas segitiga
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }
}