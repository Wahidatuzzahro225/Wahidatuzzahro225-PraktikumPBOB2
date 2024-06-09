package Pertemuan2.org.main;

import Pertemuan2.org.bangundatar.bujursangkar;
import Pertemuan2.org.bangunruang.kubus;;

public class Mkubus {
    public static void main(String[] args) {
        // Membuat objek BujurSangkar dengan panjang sisi 4 satuan
        bujursangkar bujurSangkar = new bujursangkar(4);

        // Membuat objek Kubus dengan alas berupa objek BujurSangkar
        kubus kubus = new kubus(bujurSangkar);

        // Menghitung volume kubus
        double volume = kubus.hitungVolume();
        System.out.println("Volume Kubus: " + volume);

        // Menghitung luas alas kubus
        double luasAlas = kubus.hitungLuasAlas();
        System.out.println("Luas Alas Kubus: " + luasAlas);
    }
}