/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : Vehicle.java

package Medium;

public abstract class Vehicle {
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
}
