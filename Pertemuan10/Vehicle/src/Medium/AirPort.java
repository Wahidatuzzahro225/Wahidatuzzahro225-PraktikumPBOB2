/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Nama         : Wahidatuzzahro Febria Fithrurrahmah
// NIM          : 24060122120008
// Lab          : Lab PBO B2
// Praktikum ke-: 9 (Tugas)
// Nama File    : AirPort.java

package Medium;

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to " + flyer.getClass().getSimpleName();
        }
        return "Permission denied to " + flyer.getClass().getSimpleName();
    }
}