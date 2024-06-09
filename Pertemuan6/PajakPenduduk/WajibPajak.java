package PajakPenduduk;

abstract class WajibPajak extends Penduduk {
    protected  double jumlahPajak;

    public WajibPajak(String nomorKTP, String nama, String NPWP, double tarifPajak) {
        super(nomorKTP, nama, NPWP, tarifPajak);
    }

    public abstract void hitungPajak();

    public abstract void cetakInfo();
}
