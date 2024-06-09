// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 3

package Pertemuan3;

public class Asersi1 {
	public static void main(String[] args) {
	    int x = 0;
	    if(x > 0){
	        System.out.println("x bilangan positif");
	    }else{
	        assert(x<0):"ada kesalahan kode";
	        System.out.println("x bilangan negatif");
	    }
	}
}