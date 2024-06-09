package Pertemuan3;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
  
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* Dalam metode cobaAngka, jika angka sama dengan 13, maka eksepsi AngkaSialException akan dilemparkan.
Ketika as.cobaAngka(13) dipanggil, kondisi angka == 13 terpenuhi, sehingga throw new AngkaSialException() akan dieksekusi, 
dan eksekusi akan langsung keluar dari metode cobaAngka tanpa menjalankan System.out.println(angka + " bukan angka sial");.
Oleh karena itu, baris 12 tidak akan dieksekusi ketika eksepsi terjadi. */

/* Ketika eksepsi AngkaSialException dilemparkan dalam as.cobaAngka(13), blok catch akan menangani eksepsi tersebut.
Blok catch menangkap eksepsi AngkaSialException dan menjalankan pernyataan di dalamnya.
Oleh karena itu, ketika eksepsi terjadi pada as.cobaAngka(13), blok catch akan dijalankan dan baris 21 akan dieksekusi. */
 