/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : Main.java

package Medium;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);
        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);
        Helicopter copter = new Helicopter();
        System.out.println(copter);
        System.out.println("###########################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
        System.out.println("###########################################");

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>();
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(truck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(sPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(copter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}

