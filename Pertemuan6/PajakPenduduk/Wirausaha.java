package PajakPenduduk;

class Wirausaha extends WajibPajak {
    private String SIUP;
    private double omsetPerTahun;
    static int JmlWirausaha;

    public Wirausaha(String nomorKTP, String nama, String NPWP, double tarifPajak, String SIUP, double omsetPerTahun) {
        super(nomorKTP, nama, NPWP, tarifPajak);
        this.SIUP = SIUP;
        this.omsetPerTahun = omsetPerTahun;
        JmlWirausaha++;
    }

    @Override
    public void hitungPajak() {
        double pajak = omsetPerTahun * super.tarifPajak;
        super.jumlahPajak = pajak;
    }

    @Override
    public void cetakInfo() {
        System.out.println("WIRAUSAHA");
        System.out.println("No KTP : " + super.nomorKTP);
        System.out.println("Nama : " + super.nama);
        System.out.println("NPWP : " + super.NPWP);
        System.out.println("Tarif " + super.tarifPajak);
        System.out.println("Pajak : " + super.jumlahPajak);
        System.out.println("SIUP : " + SIUP);
        System.out.println("Omset : " + omsetPerTahun);
    }

    public static int getJmlWirausaha(){
        return JmlWirausaha;
    }
}
