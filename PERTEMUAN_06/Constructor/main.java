/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_06.Constructor;


/**
 *
 * @author x260
 */
public class main {
    public static void main(String[] args) {
        daftarkan_kendaraan_polisi niko = new daftarkan_kendaraan_polisi("M.Niko NCY", "Supra", 2018, "AG-832L");
        daftarkan_kendaraan_polisi jeri = new daftarkan_kendaraan_polisi("Jerry TOM", "Beat", 2022, "AG-902L");
        
        niko.check_status();
        jeri.check_status();
    }
}
