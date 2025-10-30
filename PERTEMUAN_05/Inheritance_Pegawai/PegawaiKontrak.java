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
public class PegawaiKontrak extends Pegawai{

    int jamLembur;
    double UpahPerJam;

    void BeriUpahLembut(int waktu, double uang) {
        jamLembur = waktu;
        UpahPerJam = uang;
    }
    
    void tampilTambahan() {
        System.out.println("Jam Lembur  : " + jamLembur);
        System.out.println("Upah/Jam    : " + UpahPerJam);
        System.out.println("Total Gaji  : " + HitungTotal(gajiPokok, jamLembur * UpahPerJam));
    }
}
