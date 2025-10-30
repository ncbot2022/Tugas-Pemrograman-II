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
public class PegawaiKontrak_Overrided extends Pegawai_Override {

    int jamLembur;
    double UpahPerJam;

    void BeriUpahLembut(int waktu, double uang) {
        jamLembur = waktu;
        UpahPerJam = uang;
    }
    
    void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID         : " + id);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Jam Lembur  : " + jamLembur);
        System.out.println("Upah/Jam    : " + UpahPerJam);
        System.out.println("Total Gaji  : " + HitungTotal(gajiPokok, jamLembur * UpahPerJam));
    }
}
