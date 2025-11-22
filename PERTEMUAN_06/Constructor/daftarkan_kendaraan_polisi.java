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
public class daftarkan_kendaraan_polisi {
    public String pemilik;
    public String merek;
    public long tahun_pembelian;
    public String plat_kendaraan;
    private boolean status_terdaftar = false;
    
    public  daftarkan_kendaraan_polisi(String pemilik, String merek, long tahun_pembeli, String plat_motor){
        this.pemilik = pemilik;
        this.merek = merek;
        this.tahun_pembelian = tahun_pembeli;
        this.plat_kendaraan = plat_motor;
        status_terdaftar = 2 <= plat_kendaraan.length();
    }
    
    void check_status (){
        if(status_terdaftar){
            System.out.println(">> Kendaraan Sudah Terdaftar");
            System.out.println(">> Pemilik Asli    : "  + pemilik);
            System.out.println(">> Merek Kendaraan : "  + merek);
            System.out.println(">> Tahun Pembelian : "  + tahun_pembelian);
            System.out.println(">> Plat Kendaraan  : "  + plat_kendaraan + "\n");
            
        }else {
            System.out.println("!! Kendaraan Belum Terdaftar");
        }
    }
}
