package Pertemuan7;

public class PolimorfismeAdHoc {
    
//Polimorfisme Overloading
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    /*  Polimorfisme Overloading ini sama kasusnya dengan overloading yang telah dikenal di pertemuan sebelumnya, 
    methode dengan nama yang sama ini dapat melakukan tindakan yang berbeda atau dikenai tindakan yang berbeda. */

    public static void main(String[] args) {
        PolimorfismeAdHoc example = new PolimorfismeAdHoc();

        //Polimorfisme Overloading
        int sum1 = example.add(5,3);
        double sum2 = example.add(4.5, 2.5);

        System.out.println("sum of integers: " + sum1);
        System.out.println("sum of doubles: " + sum2);
       
        
        // Polimorfisme Coercion (Casting)
        int output1 = 'a';
        System.out.println(output1);
            /* Hasil dari int output1 = 'a' adalah 97 (berhasil dieksekusi)*/

        // double x = 15.5;
        // int output2 = x;
        // System.out.println(output2);
            /* Hasil dari double x = 15.5; int output2 = x; adalah type mismatch. Tidak bisa mengubah type dari double(real) ke bentuk integer */

        int y = 25;
        double output3 = y;
        System.out.println(output3);
            /* Hasil int y = 25; double output3 = y; adalah 25.0 (berhasil dieksekusi)*/

        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);
            /* Hasil int z = 78; char output4 = (char) z; adalah N (berhasil dieksekusi)*/

        char a = 'a';
        double output5 = a;
        System.out.println(output5);
            /* Hasil char a = 'a'; double output5 = a; adalah 97.0 (berhasil dieksekusi)*/
    }
}
