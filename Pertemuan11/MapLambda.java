/**
 * File: MapLambda.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan key dan value.
 */

package Pertemuan11;

import java.util.HashMap;
import java.util.Map;


public class MapLambda {
    public static void main(String[] args) {
        // Create a Map with NIM as the key and student name as the value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("123456", "Adi");
        mahasiswaMap.put("654321", "Bambang");
        mahasiswaMap.put("112233", "Cici");
        mahasiswaMap.put("445566", "Didi");

        // Use lambda expression to iterate and print the entries
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
