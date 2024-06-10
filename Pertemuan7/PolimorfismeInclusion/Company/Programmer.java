package Pertemuan7.PolimorfismeInclusion.Company;

public class Programmer extends Pegawai {
    int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

