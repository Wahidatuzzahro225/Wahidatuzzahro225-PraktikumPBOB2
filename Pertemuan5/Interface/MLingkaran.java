

package Pertemuan5.Interface;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jejari lingkaran: ");
            double jejari = scanner.nextDouble();

            Lingkaran lingkaran = new Lingkaran(jejari);
            System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + lingkaran.hitungLuas());
        }
    }
}