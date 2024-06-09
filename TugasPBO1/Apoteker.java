package TugasPBO1;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Apoteker {
    private String namaApoteker;
    private String ApotekerID;
    private List<Obat> Mengakses;
    private List<Pembeli> Melayani;
    private Map<String, Integer> stokObat;

    public Apoteker(String namaApoteker, String ApotekerID) {
        this.namaApoteker = namaApoteker;
        this.ApotekerID = ApotekerID;
        stokObat = new HashMap<>();
        this.Mengakses = new ArrayList<>();
        this.Melayani = new ArrayList<>();
    }

    public String getNamaApoteker(){
        return namaApoteker;
    }

    public String getApotekerID(){
        return ApotekerID;
    }

    public void setNamaApoteker(String namaApoteker){
        this.namaApoteker = namaApoteker;
    }

    public void setApotekerID(String ApotekerID){
        this.ApotekerID = ApotekerID;
    }

    public void ApotekerDetail (){
        System.out.println("Nama Apoteker: " + namaApoteker);
        System.out.println("ID Apoteker: " + ApotekerID);
    }

    public void addPembeli(Pembeli pembeli){
        Melayani.add(pembeli);
    }

    public void melayani(){
        System.out.println("=======================================");
        System.out.println("Apoteker " + namaApoteker + " melayani:");
        System.out.println("=======================================");
        for (Pembeli pembeli : Melayani){
            pembeli.DetailPembeli();
        }
    }

    public void tambahStok(Apoteker apoteker, Obat obat, int jumlah) {
        stokObat.put(obat.getnamaObat(), stokObat.getOrDefault(obat.getnamaObat(), 0) + jumlah);
        System.out.println(jumlah + " unit obat " + obat.getnamaObat() + " ditambahkan oleh Apoteker " + namaApoteker + " ke stok.");
        jumlah = jumlah + obat.getJumlahStok();
        obat.setJumlahStok(jumlah);
        System.out.println("Jumlah stok obat " + obat.getnamaObat() + " kini adalah " + obat.getJumlahStok() + "\n");
        
        // Ketika apoteker menambahkan stok, jejak mengakses stok obat itu akan terekan dan dikumpulkan dalam suatu list
        Mengakses.add(obat);
    }

    public void viewMengaksesObat(){
        System.out.println("=======================================");
        System.out.println("Apoteker " + namaApoteker + " mengakses obat:");
        System.out.println("=======================================");
        for (Obat obat : Mengakses){
            obat.CekDetailObat();
            System.out.println("\n");
        
        }
    }
    public int cekStok(Obat obat) {
        return stokObat.getOrDefault(obat.getnamaObat(), 0);
    }
}


