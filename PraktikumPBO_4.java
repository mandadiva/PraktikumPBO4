/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;
/**
 *
 * @author user
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Amanda", 23, "Software Engineer", 20000000);

        // Menampilkan Informasi pekerja
        System.out.println(pekerja.toString());
        
        // Mengubah nama pekerja menggunakan metode setter
        pekerja.setNama("Ravi");
        
        // Menampilkan ulang informasi pekerja setelah ubah nama
        System.out.println("\nInformasi Pekerja Setelah mengubah nama:");
        System.out.println(pekerja.toString());
        
        // Mencoba akses langsung
        System.out.println("\nMengakses Atribut Secara Langsung:");
        System.out.println("Usia: " + pekerja.usia);
    }
}        