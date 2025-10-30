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
public class Pegawai_Override {

    String nama;
    String id;
    double gajiPokok;

    void pegawaiTerdaftar(String _nama, String _id, double _gajiPokok) {
        nama = _nama;
        id = _id;
        gajiPokok = _gajiPokok;
    }

    void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID         : " + id);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
    
    double HitungTotal(double data1,  double data2){
        return data1 + data2;
    }

}
