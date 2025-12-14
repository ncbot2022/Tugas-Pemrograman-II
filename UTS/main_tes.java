/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3;

/**
 *
 * @author x260
 */
public class main_tes {
    public static void main(String[] args) {
        Interface_System jalankan = new Implemensy_System();
        produk tes = new Gudang_produkA();
        produk tess = new Gudang_produkB();
        
        System.out.println(tes.getLokasi());
        System.out.println(tess.getLokasi());
        System.out.println(jalankan.CheckLogin("niko", "nilai"));
        
        System.out.println("\n######## TAMNAHKAN BARANG ################################");
        jalankan.tambah_gudang_A("22301", "Kipas", 20000,  12);
        jalankan.tambah_gudang_B("20332", "Kipas B", 20000, 24);
        
        System.out.println("\n######## TAMPILAKN BARANG ################################");  
        System.out.println("\n===== DATA GUDANG A =====");
        for (produk p : jalankan.getListGudangA()) {
            System.out.println(p.dataOut());
        }

        System.out.println("\n===== DATA GUDANG B =====");
        for (produk p : jalankan.getListGudangB()) {
            System.out.println(p.dataOut());
        }
        
                System.out.println("\n######## TAMNAHKAN BARANG ################################");
        jalankan.tambah_gudang_A("221", "Kipa212s", 20000,  10);
        jalankan.tambah_gudang_B("203232", "Ki324pas B", 20000, 20);
        
        System.out.println("\n######## TAMPILAKN BARANG ################################");  
        System.out.println("\n===== DATA GUDANG A =====");
        for (produk p : jalankan.getListGudangA()) {
            System.out.println(p.dataOut());
        }

        System.out.println("\n===== DATA GUDANG B =====");
        for (produk p : jalankan.getListGudangB()) {
            System.out.println(p.dataOut());
        }
        
        System.out.println("JUMLAH HARGA GUDANG A : " + jalankan.hitungTotalNilai(jalankan.getListGudangA()));
        System.out.println("JUMLAH HARGA GUDANG B : " + jalankan.hitungTotalNilai(jalankan.getListGudangB()));
        System.out.println("JUMLAH HARGA GUDANG A + PAJAK 0 %: " + jalankan.hitungTotalNilaiPajak(jalankan.getListGudangA()));
        System.out.println("JUMLAH HARGA GUDANG B + PAJAK 10 %: " + jalankan.hitungTotalNilaiPajak(jalankan.getListGudangB()));
        
        
//        jalankan.kurangiStokGudangA("22301", 2);
//              System.out.println("\n===== DATA GUDANG A =====");
//        for (produk p : jalankan.getListGudangA()) {
//            System.out.println(p.dataOut());
//        }
//
//        System.out.println("\n===== DATA GUDANG B =====");
//        for (produk p : jalankan.getListGudangB()) {
//            System.out.println(p.dataOut());
//        }
//        jalankan.kurangiStokGudangA("22301", 23);
//        
//        System.out.println("\n===== DATA GUDANG A =====");
//        for (produk p : jalankan.getListGudangA()) {
//            System.out.println(p.dataOut());
//        }
//
//        System.out.println("\n===== DATA GUDANG B =====");
//        for (produk p : jalankan.getListGudangB()) {
//            System.out.println(p.dataOut());
//        }
//        
//        jalankan.tambahStokGudangA("22301", 10);
//        
//        System.out.println("\n===== DATA GUDANG A =====");
//        for (produk p : jalankan.getListGudangA()) {
//            System.out.println(p.dataOut());
//        }
        
//        jalankan.editProdukGudangB("20332", "S", 0L, 10L);
//        System.out.println("\n===== DATA GUDANG B =====");
//        for (produk p : jalankan.getListGudangB()) {
//            System.out.println(p.dataOut());
//        }
    }
    
    
}
