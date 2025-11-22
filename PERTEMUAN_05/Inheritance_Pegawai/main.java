/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_05.Inheritance_Pegawai;
/**
 *
 * @author x260
 */
public class main {

    public static void main(String[] args) {
        PegawaiTetap Pegawai_Tetap = new PegawaiTetap();
        PegawaiKontrak Pegawai_Kontrak = new PegawaiKontrak();

        System.out.println("-------------------------------");
        System.out.println("         PEGAWAI TETAP         ");
        System.out.println("-------------------------------");
        Pegawai_Tetap.pegawaiTerdaftar("Niko", "A25B7", 1000000);
        Pegawai_Tetap.berikTunjangan(1000000);
        Pegawai_Tetap.tampilkanData();
        Pegawai_Tetap.tampilTambahan();
        System.out.println("______________________________");
        Pegawai_Tetap.pegawaiTerdaftar("Dandi", "A25B8", 1000000);
        Pegawai_Tetap.berikTunjangan(1200000);
        Pegawai_Tetap.tampilkanData();
        Pegawai_Tetap.tampilTambahan();
        System.out.println("______________________________" + "\n");

        System.out.println("-------------------------------");
        System.out.println("        PEGAWAI KONTRAK        ");
        System.out.println("-------------------------------");
        Pegawai_Kontrak.pegawaiTerdaftar("Rihdo", "C3B1", 1000000);
        Pegawai_Kontrak.BeriUpahLembut(12, 5000);
        Pegawai_Kontrak.tampilkanData();
        Pegawai_Kontrak.tampilTambahan();
        System.out.println("______________________________");
        Pegawai_Kontrak.pegawaiTerdaftar("Radir Nay", "C6B12", 1000000);
        Pegawai_Kontrak.BeriUpahLembut(20, 5000);
        Pegawai_Kontrak.tampilkanData();
        Pegawai_Kontrak.tampilTambahan();
        System.out.println("______________________________");
    }
}
