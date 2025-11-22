/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_05.Keyword_This;

/**
 *
 * @author x260
 */
public class pesawat {
    private  final String merk;
    private  final String warna;
    private final int kecepatan;
    
     public pesawat(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = 0; 
    }
 
    public void tampilkanInfo() {
        System.out.println("Merk Pesawat   : " + merk);
        System.out.println("Warna Pesawat  : " + warna);
        System.out.println("Kecepatan    : " + kecepatan + " km/jam");
        System.out.println("-------------------------------");
    }

}
