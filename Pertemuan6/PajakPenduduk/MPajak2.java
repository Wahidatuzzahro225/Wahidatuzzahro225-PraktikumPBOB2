package PajakPenduduk;

public class MPajak2 {
    public static void main(String[] args) {
        // Membuat objek Apoteker
        Departemen D1 = new Departemen("Pendidikan",4000000);
        PNS P1 = new PNS("1234","Andi","1001",10,"2222",D1);
        Wirausaha P2 = new Wirausaha("1235","Arif","1002",10,"2221",400000000);
        Petani P3 = new Petani("1236","Budi","Bogor","Teh");
        
        // Digunakan untuk menghitung pajak, apabila P1 dan P2 tidak diberlakukan methode seperti yang ada dibawah ini, 
        // maka pajak akan bernilai 0
        P1.hitungPajak();
        P2.hitungPajak();

        // Menampilkan info 
        P1.cetakInfo();
        System.out.println("\n");
        P2.cetakInfo();
        System.out.println("\n");
        P3.cetakInfo();
        System.out.println("\n");

        System.out.println("Jumlah PNS = " + PNS.getJmlPNS());
        System.out.println("Jumlah Wirausaha = " + Wirausaha.getJmlWirausaha());
        System.out.println("Jumlah Petani = " + Petani.getJmlPetani());
    }
}
