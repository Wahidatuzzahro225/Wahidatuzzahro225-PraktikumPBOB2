/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : Truck.java

package Medium;

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = 1000;
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
        return "Truck adalah angkutan darat yang sangat handal";
    }
}

