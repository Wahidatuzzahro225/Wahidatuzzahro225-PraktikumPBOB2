/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("DOR");
        Senjata m16 = new Senjata("RATATATATA");

        System.out.print("AK47 Menembak 3x: ");
        ak47.menembak(3);

        System.out.print("M16 Menembak 1x: ");
        m16.menembak(1);

        System.out.println("AK 47 menusuk : " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK 47 menusuk : " + ak47.menusuk());
    }
}
