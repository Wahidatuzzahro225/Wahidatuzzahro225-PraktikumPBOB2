// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// Lab          : Lab PBO B2
// Praktikum ke-: 2

package Pertemuan2;

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik;

    Titik (double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public static double getCounterTitik(){
        return counterTitik;
    }
    public double getJarakPusat(){
        return Math.sqrt(absis*absis +ordinat*ordinat);
    }
    public void reflexiX(){
        ordinat = -ordinat;
    }
    public void refleksiY(){
        absis = -absis;
    }
    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}
