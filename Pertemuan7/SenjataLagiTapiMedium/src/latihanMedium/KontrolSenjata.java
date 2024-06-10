/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public void isAdaPeluru() {
        if (senjata.getPeluru() > 0) {
            System.out.println(">> Siap menembak " + senjata.getPeluru() + " kali");
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        isAdaPeluru();
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Menusuk dengan bayonet");
        } else {
            System.out.println("Tidak ada bayonet");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
