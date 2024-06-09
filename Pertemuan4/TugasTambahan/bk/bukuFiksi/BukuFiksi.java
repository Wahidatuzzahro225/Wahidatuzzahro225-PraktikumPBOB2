package Pertemuan4.TugasTambahan.bk.bukuFiksi;

import Pertemuan4.TugasTambahan.bk.buku.Buku;

public class BukuFiksi extends Buku {
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public BukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre() {
        return genre;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Genre: " + genre);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }
}
