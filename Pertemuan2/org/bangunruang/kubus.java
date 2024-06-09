package Pertemuan2.org.bangunruang;

import Pertemuan2.org.bangundatar.bujursangkar;

public class kubus {
    private bujursangkar permukaan;

    public kubus(bujursangkar permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        double sisi = permukaan.getPanjangSisi();
        return sisi * sisi * sisi;
    }

    public double hitungLuasAlas() {
        return permukaan.hitungLuas();
    }
}

