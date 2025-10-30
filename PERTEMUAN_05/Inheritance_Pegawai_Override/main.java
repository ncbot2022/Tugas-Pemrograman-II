/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_05.Inheritance_Pegawai_Override;

/**
 *
 * @author x260
 */
public class main {

    public static void main(String[] args) {
        Pegawai_Override Pegawai_mentah = new Pegawai_Override ();
        PegawaiTetap_Override Pegawai_Tetap = new PegawaiTetap_Override();
        PegawaiKontrak_Overrided Pegawai_Kontrak = new PegawaiKontrak_Overrided();
        
        Pegawai_mentah.pegawaiTerdaftar("BOSS", "A0B0", 50000000);
        Pegawai_mentah.tampilkanData();
        
        System.out.println("-------------------------------");
        System.out.println("         PEGAWAI TETAP         ");
        System.out.println("-------------------------------");
        Pegawai_Tetap.pegawaiTerdaftar("Niko", "A25B7", 1000000);
        Pegawai_Tetap.berikTunjangan(1000000);
        Pegawai_Tetap.tampilkanData();
        System.out.println("______________________________");
  

        System.out.println("-------------------------------");
        System.out.println("        PEGAWAI KONTRAK        ");
        System.out.println("-------------------------------");
        Pegawai_Kontrak.pegawaiTerdaftar("Rihdo", "C3B1", 1000000);
        Pegawai_Kontrak.BeriUpahLembut(12, 5000);
        Pegawai_Kontrak.tampilkanData();
    }
}
