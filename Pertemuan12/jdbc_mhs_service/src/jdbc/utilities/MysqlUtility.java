package jdbc.utilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author wahidatuzzahrofebriafithrurrahmah
 */
public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:/jdbc_mhs";
                
                // Sesuaikan username dan password
                String user = "student";
                String password = "Pebi1234";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi: " + sqle.getMessage());
            }
        } 
        return koneksi;  
    }
    
}
