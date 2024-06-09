// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 1

package Pertemuan1;

public class Titik{
    /* ATRIBUT*/
    double absis;
    double ordinat;
    static int counterTitik; 

    /* METHOD */
    Titik(){
        this(0,0);
        counterTitik++; //digunakan untuk menghitung ada berapa objek titik yang telah dibuat.
    }

    /*Method ini digunakan sebagai konstruktor, dimana dalam pembuatan objek di main nantinya, ketika kita membuat new objek maka harus menyebutkan atribut atribut yang dibutuhkan sesuai.
      Contoh dalam kasus ini, konstruktor titik memiliki atribut berupa absis dan ordinat. Oleh karena itu maka, ketika membuat objek baru di main nantinya maka harus kita sertakan atribut absis dan ordinat sesuai dengan type yang telah diatur di dalam classnya. */
    public Titik(double absis, double ordinat){
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}

    /* SETTER */ 
       // pada saat membuat objek tentunya kita telah menambahkan absis atau ordinat yang ada, akan tetapi ordinat dan absis tersebut dapat kita rubah dengan memanggil method setAbsis atau setOrdinat
       // implementasinya pada main ialah dengan memanggil objek.setter(x). --> dapat dilihat pada main
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    /* GETTER */ 
       // Methode getter ini digunakan untuk menampilkan sebuah nilai yang kita harapkan 
       // implementasinya pada main ialah dengan memanggil objek.getter(). --> dapat dilihat pada main
    
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }

       // menjadi salah satu getter, getcountertitik ini akan mengembalikan nilai counter titik.
    public static int getCounterTitik(){
        return counterTitik;
    }
}

/* KETERANGAN */
    /* Jika counterTitik menggunakan static, maka setiap perubahan pada counterTitik akan mempengaruhi semua objek (instance)    
       dari kelas tersebut. Sebaliknya, jika counterTitik tidak menggunakan static, setiap objek akan memiliki salinan sendiri
       dari counterTitik, dan perubahan pada satu objek tidak akan mempengaruhi objek lainnya. */
    
       /* Apabila counterTitik menggunakan static 
       pemanggilan "System.out.println(Titik.getCounterTitik());""
       ini yang dipanggil adalah Titik yang merupakan Class. maka titik tersebut akan menghitung objek titik yang telah dibuat sebelumnya.
       setiap kali objek Titik dibuat, nilai dari counterTitik akan bertambah.
       
       Apabila Counter titik tidak menggunakan static
       pemanggilan "System.out.println(titik1.getCounterTitik());""
       pemanggilan "System.out.println(titik2.getCounterTitik());""
       setiap objek memiliki salinan sendiri dari variabel tersebut. Oleh karena itu, setiap objek memiliki nilai counterTitik yang terpisah, 
       dan membuat objek baru tidak mempengaruhi nilai counterTitik dari objek lainnya */

    /* Apabila counterTitik dan getCounterTitik menggunakan static 
       Jika getCounterTitik() menggunakan static, maka itu akan menjadi metode class yang dapat dipanggil tanpa membuat instance dari kelas 
       tersebut. Metode ini berlaku untuk keseluruhan kelas.
       Dalam contoh ini, counterTitik adalah variabel class (static), dan getCounterTitik() adalah metode class (static) untuk mengaksesnya.

       Apabila counterTitik dan getCounterTitik tidak  menggunakan static
       Sebaliknya, jika getCounterTitik() tidak menggunakan static, maka itu akan menjadi metode instance yang harus dipanggil pada suatu 
       instance dari kelas tersebut.
       Dalam contoh ini, counterTitik adalah variabel instance, dan getCounterTitik() adalah metode instance untuk mengaksesnya.*/

    /* Apabila Atribut Static dengan Selektor Tidak Static
       Dalam kasus ini, meskipun staticAttribute dideklarasikan sebagai variabel static, itu masih dapat diakses melalui objek (instance) 
       kelas Example. Namun, ini bukan cara yang disarankan karena variabel static seharusnya diakses melalui nama kelas, bukan instance.
       
       Apabila Atribut Tidak Static dengan Selektor Static
       Dalam kasus ini, mencoba mengakses nonStaticAttribute secara langsung dari metode static (dalam hal ini, metode main) akan 
       menyebabkan kesalahan kompilasi. Ini karena atribut non-static berkaitan dengan instance kelas, sedangkan metode static tidak 
       memiliki instance spesifik terkait dengan mereka. */
       
