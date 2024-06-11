/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : AirPlane.java

package Medium;

public abstract class Airplane extends Vehicle implements IFlyer {
    private double maxLoad;

    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public abstract void takeOff();

    @Override
    public abstract void land();

    @Override
    public abstract void fly();
}

