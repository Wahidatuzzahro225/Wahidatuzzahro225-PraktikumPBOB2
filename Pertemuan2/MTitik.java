// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2

package Pertemuan2;

public class MTitik {
    public static void main(String[] args) {
        
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik();

        System.out.println("jumlah objek titik:" + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis()+ "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis()+ "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis()+ "," + t3.getOrdinat() + ")");
        
        // jarak titik ke pusat
        System.out.println("Jarak t1(" + t1.getAbsis()+ "," + t1.getOrdinat() + ")" + "ke pusat adalah " + t1.getJarakPusat());

        //refleksi sumbu x
        t1.reflexiX();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis()+ ", " + t1.getOrdinat() + ")");

        //refleksi sumbu y
        t1.refleksiY();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis()+ ", " + t1.getOrdinat() + ")");

        //refleksi sumbu x tanpa mengubah titik aslinya
        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");
        
        //refleksi sumbu y tanpa mengubah titik aslinya
        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")");
    }
}

/* KESIMPULAN */
    // Dengan menggunakan konsep enkapsulasi, atribut x dan y dalam class Titik menjadi private sehingga dapat diakses dan dimodifikasi 
    // hanya melalui method yang telah disediakan. Dengan tambahan method-method seperti getJarakPusat, refleksiX, refleksiY, getRefleksiX, 
    // dan getRefleksiY, kita dapat melakukan operasi-operasi geometri seperti menghitung jarak titik ke pusat, melakukan pencerminan 
    // terhadap sumbu X dan Y, serta mendapatkan titik hasil pencerminan tersebut. Dengan memodifikasi access modifier dari private menjadi 
    // public atau sebaliknya, kita dapat mengontrol akses terhadap atribut dan method sesuai kebutuhan.






