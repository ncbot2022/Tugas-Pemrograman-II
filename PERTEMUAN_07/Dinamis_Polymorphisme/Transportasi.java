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
// SEBAGAI CLASS INDUK
public class Transportasi {
    String tujuan;
    public Transportasi(String tujuan) {
        this.tujuan = tujuan;
    }
    
    double harga_tiket() {
        return 0; 
    }
}
