package Pertemuan2.org.bangundatar;

import Pertemuan2.org.poligon.poligon;

public class bujursangkar extends poligon {
    private double panjangSisi;

    public bujursangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4; // BujurSangkar memiliki 4 sisi
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
}