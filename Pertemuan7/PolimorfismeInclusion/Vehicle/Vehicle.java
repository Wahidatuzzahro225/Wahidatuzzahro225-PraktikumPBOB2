package Pertemuan7.PolimorfismeInclusion.Vehicle;

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}
