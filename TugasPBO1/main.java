package TugasPBO1;

public class main {
    public static void main(String[] args) {
        int JumlahPembeli;

        // Membuat objek Apoteker
        Apoteker Adipati = new Apoteker("Adipati Daroja", "AP120");
        Apoteker Rena = new Apoteker("Rena Calya", "AP121");
       
        // Membuat objek Pembeli
        Pembeli Arensia = new Pembeli("Arensia Manikmaya", "PE003", 20, "Jepara\n");
        Pembeli Findri = new Pembeli("Findrillia Sarensia", "PE005", 24, "Magelang\n");
        Pembeli Jolie = new Pembeli("Jolie Reany", "PE007", 18, "Jakarta timur\n");
        Pembeli Harashta = new Pembeli("Harashta Farasya", "PE009", 40, "Cibubur\n");
        Pembeli Jelita = new Pembeli("Jelita Yuli", "PE012", 23, "Semarang\n");
        Pembeli Melati = new Pembeli("Melati Teja", "PE0014", 19, "Purwodadi\n");
        
        //Membuat objek Obat
        Obat Paracetamol = new Obat("Paracetamol", "Pereda Nyeri", 50, 10000);
        Obat Ketoconazole = new Obat("Ketoconazole", "Pereda Gatal", 20, 5000);
        
        // Simulasi 1
        System.out.println("\n---------------------Simulasi 1--------------------");
        System.out.println("    Apoteker menambahkan stok obat Ketoconazole      \n");
        Adipati.tambahStok(Adipati, Ketoconazole, 20);
        Rena.tambahStok(Rena, Paracetamol, 20);

        // Simulasi 2
        System.out.println("\n---------------------Simulasi 2--------------------");
        System.out.println("         Pembeli membeli obat Paracetamol            \n");
        Arensia.beliObat(Paracetamol, 10);
        
        // Simulasi 3
        System.out.println("\n---------------------Simulasi 3--------------------");
        // Pembeli dilayani salah satu apoteker
        Adipati.addPembeli(Arensia);
        Adipati.addPembeli(Findri);
        Adipati.addPembeli(Jolie);

        Rena.addPembeli(Melati);
        Rena.addPembeli(Jelita);
        Rena.addPembeli(Harashta);
        
        // System mendata apoteker melayani pembeli mana saja
        System.out.println(" System mendata apoteker melayani pembeli mana saja  \n");
        Adipati.melayani();
        Rena.melayani();
        
        // Simulasi 4
        System.out.println("\n---------------------Simulasi 4--------------------");
        System.out.println(" System mendata apoteker mengakses obat mana saja  \n");
        
        // System mendata apoteker mengakses obat mana saja, Ketika apoteker menambahkan stok, jejak mengakses stok obat itu 
        // akan terekam dan dikumpulkan dalam suatu list
        Adipati.viewMengaksesObat();
        Rena.viewMengaksesObat();
        
        // Simulasi 5
        System.out.println("\n---------------------Simulasi 5--------------------");
        System.out.println("         System menghitung jumlah pembeli            \n");
        
        JumlahPembeli= Pembeli.getJumlahPembeli();
        System.out.println("Jumlah pembeli adalah " + JumlahPembeli);
        
    }
}
