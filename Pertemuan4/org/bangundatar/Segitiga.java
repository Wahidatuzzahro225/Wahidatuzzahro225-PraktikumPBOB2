package Pertemuan4.org.bangundatar;

import Pertemuan4.org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = 3;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
}

