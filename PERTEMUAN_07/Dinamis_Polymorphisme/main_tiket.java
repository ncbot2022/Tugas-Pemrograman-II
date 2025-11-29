/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_07.Dinamis_Polymorphisme;

/**
 *
 * @author x260
 */
import java.util.Scanner; // IMPORT LIBRARY YANG DI BUTUHKAN

public class main_tiket {

    public static void main(String[] args) {
        Scanner inputkey = new Scanner(System.in);

        System.out.println("=== SISTEM PEMESANAN TIKET TRANSPORTASI ===");
        System.out.println("1. Bus Bagong");
        System.out.println("2. Kereta KAI");
        System.out.println("3. Pesawat Terbang");

        System.out.print("Pilih jenis transportasi: ");
        int pilihan = inputkey.nextInt();
        inputkey.nextLine();

        System.out.print("Jumlah Kursi yang akan anda pesan: ");
        int kursi = inputkey.nextInt();
        inputkey.nextLine();

        System.out.println("=== SISTEM PEMESANAN TIKET TRANSPORTASI ===");
        System.out.println("1. Jakarta");
        System.out.println("2. Bandung");
        System.out.println("3. Surabaya");

        System.out.print("Tujuan Anda Kursi yang akan anda pesan: ");
        String tujuan = inputkey.nextLine();
 

        Transportasi transport = null;
        switch (pilihan) {
            case 1:
                transport = new Bus_bagong(tujuan);
                break;
            case 2:
                transport = new kereta_KAI(tujuan);
                break;
            case 3:
                transport = new Pesawat_terbang(tujuan);
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
                System.exit(0);
        }

        double hargapertiket = transport.harga_tiket();
        double total = hargapertiket * kursi;

        System.out.println("\n=== DETAIL PEMESANAN ===");
        System.out.println("Transportasi : " + transport.getClass().getSimpleName());
        System.out.println("Tujuan       : " + tujuan);
        System.out.println("Harga/Tiket  : Rp " + hargapertiket);
        System.out.println("Jumlah       : " + kursi);
        System.out.println("Total Bayar  : Rp " + total);
    }
}
