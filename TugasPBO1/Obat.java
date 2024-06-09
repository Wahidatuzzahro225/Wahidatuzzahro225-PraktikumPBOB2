package TugasPBO1;

import java.util.List;
import java.util.ArrayList;

public class Obat {
    private String namaObat;
    private String fungsi;
    private int jumlahStok;
    private int harga;

    public Obat(String namaObat,String fungsi, int jumlahStok, int harga) {
        this.namaObat = namaObat;
        this.fungsi = fungsi;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }
    
    public String getnamaObat(){
        return namaObat;
    }

    public String getFungsi(){
        return fungsi;
    }

    public int getJumlahStok(){
        return jumlahStok;
    }

    public int getHarga(){
        return harga;
    }

    public void setnamaObat(String namaObat){
        this.namaObat = namaObat;
    }

    public void setFungsi(String fungsi){
        this.fungsi = fungsi;
    }

    public void setJumlahStok(int jumlahStok){
        this.jumlahStok = jumlahStok;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void CekDetailObat(){
        System.out.println("Nama Obat: " + namaObat);
        System.out.println("Fungsi Obat: " + fungsi);
        System.out.println("Stok Obat Akhir: " + jumlahStok);
        System.out.println("Harga Obat: " + harga);
    }

    public void hargaObat(Obat obat, int jumlah) {
        jumlah = jumlah * obat.getHarga();
        System.out.println("Harga total obat yang dibeli adalah " + jumlah);
    }
}


