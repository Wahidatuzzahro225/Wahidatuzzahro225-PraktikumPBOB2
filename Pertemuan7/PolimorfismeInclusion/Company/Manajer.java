package Pertemuan7.PolimorfismeInclusion.Company;

public class Manajer extends Pegawai {
    int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
