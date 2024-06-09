package TugasPBO1;

import java.util.List;
import java.util.ArrayList;

public class Pembeli {
    private String namaPembeli;
    private String PembeliID;
    private int umur;
    private String alamat;
    List<Obat> KebutuhanObat;
    static int JumlahPembeli;

    public Pembeli(String namaPembeli, String PembeliID, int umur, String alamat) {
        this.namaPembeli = namaPembeli;
        this.PembeliID = PembeliID;
        this.umur = umur;
        this.alamat = alamat;
        this.KebutuhanObat = new ArrayList<>();
        JumlahPembeli++;
    }

    public String getnamaPembeli(){
        return namaPembeli;
    }

    public String getPembeliID(){
        return PembeliID;
    }

    public int getUmur(){
        return umur;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setnamaPembeli(String namaPembeli){
        this.namaPembeli = namaPembeli;
    }

    public void setPembeliID(String PembeliID){
        this.PembeliID = PembeliID;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void DetailPembeli(){
        System.out.println("Nama: " + namaPembeli);
        System.out.println("ID: " + PembeliID);
        System.out.println("Umur: " + umur);
        System.out.println("alamat: " + alamat);
    }
    public void beliObat(Obat obat, int jumlah) {
        if (jumlah <= obat.getJumlahStok()) {
            System.out.println( namaPembeli + " membeli " + jumlah + " unit obat " + obat.getnamaObat() + ".");
            obat.hargaObat(obat,jumlah);
            
            System.out.println("\n" + jumlah + " unit obat " + obat.getnamaObat() + " terjual.");
            jumlah =  obat.getJumlahStok() - jumlah;
            obat.setJumlahStok(jumlah);
            System.out.println("Jumlah stok obat " + obat.getnamaObat() + " kini adalah " + obat.getJumlahStok() );
            
        }else {
            System.out.println("Stok obat " + obat.getnamaObat() + " tidak mencukupi.");
        }
    }
    public void CekObatmu(){
        for(Obat obat : KebutuhanObat){
            obat.CekDetailObat();
            
        }
    } 
    public static int getJumlahPembeli(){
        return JumlahPembeli;
    }
}
