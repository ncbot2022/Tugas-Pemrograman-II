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
public class PegawaiTetap extends Pegawai{

    double tunjangan;

    void berikTunjangan(double UangTunjangan) {
        tunjangan = UangTunjangan;
    }

    double TotalGaji() {
        double GajiBonus = gajiPokok + tunjangan;
        return GajiBonus;
    }

    void tampilTambahan() {
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + HitungTotal(gajiPokok, tunjangan));
    }
}
