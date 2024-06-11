/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : Armadakendaraan.java

package Medium;

import java.util.ArrayList;
import java.util.List;

public class ArmadaKendaraan<T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(T kendaraan) {
        armada.add(kendaraan);
    }

    public List<T> getAllArmada() {
        return armada;
    }
}
