// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2(Tugas Tambahan)

package Pertemuan2.TugasTambahan;

public class MPrismaSegitiga {
    public static void main(String[] args) {
        // Membuat objek Segitiga dengan alas 3 dan tinggi 4
        Segitiga segitiga = new Segitiga(3, 4);
        
        // Membuat objek PrismaSegitiga dengan alas segitiga dan tinggi prisma 5
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(segitiga, 5);

        // Menghitung volume prisma segitiga
        double volume = prismaSegitiga.hitungVolume();
        System.out.println("Volume Prisma Segitiga: " + volume);

        // Menghitung luas permukaan prisma segitiga
        double luasPermukaan = prismaSegitiga.hitungLuasPermukaan();
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}
