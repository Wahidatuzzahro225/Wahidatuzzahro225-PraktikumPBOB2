package Pertemuan4.org.bangundatar;

import Pertemuan4.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = 4;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}
