package PajakPenduduk;

class PNS extends WajibPajak {
    private String NIP;
    private Departemen departemen;
    static int JmlPNS;

    public PNS(String nomorKTP, String nama, String NPWP, double tarifPajak, String NIP, Departemen departemen) {
        super(nomorKTP, nama, NPWP, tarifPajak);
        this.NIP = NIP;
        this.departemen = departemen;
        JmlPNS++;
    }

    @Override
    public void hitungPajak() {
        double gajiPokok = departemen.getGajiPokok();
        double pajak = gajiPokok * super.tarifPajak * 12;
        super.jumlahPajak = pajak;
    }

    @Override
    public void cetakInfo() {
        System.out.println("PNS");
        System.out.println("No KTP : " + super.nomorKTP);
        System.out.println("Nama : " + super.nama);
        System.out.println("NPWP : " + super.NPWP);
        System.out.println("Tarif " + super.tarifPajak);
        System.out.println("Pajak : " + super.jumlahPajak);
        System.out.println("NIP : " + NIP);
        System.out.println("Departemen : " + departemen.getNama());
        System.out.println("Gaji Pokok : " + departemen.getGajiPokok());
    }

    public static int getJmlPNS(){
        return JmlPNS;
    }
}
