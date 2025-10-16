/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_03;

/**
 *
 * @author x260
 */
public class utama {
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________");
        mahasiswa m1 = new mahasiswa("2455201014", "M.Niko", 3.3);
        m1.tampil_mahasiswa();
        m1.nilai_sanggah(0.5);
        m1.tampil_mahasiswa();
        
        System.out.println("Predikat yang saya peroleh  dalah " + m1.predikat());
        System.out.println("KIP : " + m1.kip(12));
        System.out.println("_____________________________________________________________");     
    }
 
}
