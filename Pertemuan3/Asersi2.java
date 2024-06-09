// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 3

package Pertemuan3;
import static java.lang.Math.PI;

public class Asersi2 {
	public static void main (String[] args) {
		double jarijari = 0;
	    assert(jarijari>0):"jari jari tidak boleh nol";
	    Lingkaran l = new Lingkaran(jarijari);
	    double kelilingLingkaran = l.hitungKeliling();
	    System.out.println("keliling lingkaran = " + kelilingLingkaran);
	  }
}

class Lingkaran{
	private double jarijari;
	public Lingkaran(double jarijari){
		this.jarijari = jarijari;
	}
	public double hitungKeliling(){
		double keliling = 2*PI*jarijari;
		return keliling;
	}
}


