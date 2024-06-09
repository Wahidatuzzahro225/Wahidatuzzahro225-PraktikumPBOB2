package PajakPenduduk;

class Petani extends Penduduk {
    private String asalKota;
    private String jenisPertanian;
    static int JmlPetani;

    public Petani(String nomorKTP, String nama, String asalKota, String jenisPertanian) {
        super(nomorKTP, nama, "", 0); // NPWP dan tarif pajak tidak diperlukan
        this.asalKota = asalKota;
        this.jenisPertanian = jenisPertanian;
        JmlPetani++;
    }

    @Override
    public void cetakInfo() {
        System.out.println("PETANI");
        System.out.println("No KTP : " + super.nomorKTP);
        System.out.println("Nama : " + super.nama);
        System.out.println("Kota : " + asalKota);
        System.out.println("Jenis Tani " + jenisPertanian);
    }

    public static int getJmlPetani(){
        return JmlPetani;
    }
}
