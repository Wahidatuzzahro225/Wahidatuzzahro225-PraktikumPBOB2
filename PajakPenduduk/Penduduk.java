package PajakPenduduk;

abstract class Penduduk {
    protected String nomorKTP;
    protected String nama;
    protected String NPWP;
    protected double tarifPajak;

    public Penduduk(String nomorKTP, String nama, String NPWP, double tarifPajak) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.NPWP = NPWP;
        this.tarifPajak = tarifPajak;
    }

    public abstract void cetakInfo();
    
}
