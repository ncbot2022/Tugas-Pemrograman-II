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
public class PegawaiTetap_Override extends Pegawai_Override {

    double tunjangan;

    void berikTunjangan(double UangTunjangan) {
        tunjangan = UangTunjangan;
    }

    double TotalGaji() {
        double GajiBonus = gajiPokok + tunjangan;
        return GajiBonus;
    }
    
    @Override
    void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID         : " + id);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + HitungTotal(gajiPokok, tunjangan));
    }
} 
