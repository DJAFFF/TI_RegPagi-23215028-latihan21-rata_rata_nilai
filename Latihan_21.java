/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_21 {
    
    public static void main(String[] args) {
        System.out.println("Input:");
        System.out.println("Buatlah program rata-rata nilai yang inputannya berasal dari user.");
        System.out.println("Masukkan Banyaknya Mahasiswa : 4");
        System.out.println("Nilai Mahasiswa ke-1 : 9");
        System.out.println("Nilai Mahasiswa ke-2 : 10");
        System.out.println("Nilai Mahasiswa ke-3 : 9");
        System.out.println("Nilai Mahasiswa ke-4 : 10");

        int[] nilaiMahasiswa = {9, 10, 9, 10};
        double rataRataNilai = hitungRatarataValues(nilaiMahasiswa);

        System.out.println("\nOutput:");
        System.out.println("Masukkan Banyaknya Mahasiswa : 4");
        System.out.println("Nilai Mahasiswa ke-1 : 9");
        System.out.println("Nilai Mahasiswa ke-2 : 10");
        System.out.println("Nilai Mahasiswa ke-3 : 9");
        System.out.println("Nilai Mahasiswa ke-4 : 10");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRataNilai);
        System.out.println("Developed by : Rizki Adam Kurniawan");
        System.out.println("BUILD SUCCESSFUL (total time: 7 sec)");
    }

    public static double hitungRatarataValues(int[] values) {
        double total = 0;
        for (int value : values) {
            total += value;
        }
        return total / values.length;
    }
}

