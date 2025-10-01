/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_01;

/**
 *
 * @author x260
 */
import java.util.Scanner;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBO_Master prosedure = new PBO_Master();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // buffer enter

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            input.nextLine(); // buffer enter
        }

        // Tampilkan hasil
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Nilai: " + nilai[i] 
                               + " (Grade: " + prosedure.tentukanGrade(nilai[i]) + ")");
        }

        // Hitung rata-rata, nilai tertinggi, nilai terendah
        double rataRata = prosedure.hitungRataRata(nilai);
        int nilaiTertinggi = prosedure.cariMaks(nilai);
        int nilaiTerendah = prosedure.cariMin(nilai);

        System.out.println("\nRata-rata nilai  : " + rataRata);
        System.out.println("Nilai tertinggi  : " + nilaiTertinggi);
        System.out.println("Nilai terendah   : " + nilaiTerendah);

        input.close();
    }
    
}
