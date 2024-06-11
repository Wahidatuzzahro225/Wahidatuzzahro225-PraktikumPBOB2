/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : Helicopter.java

package Medium;

public class Helicopter extends Airplane {
    public Helicopter() {
        super(1500);
    }

    @Override
    public void takeOff() {
    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
    }

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
