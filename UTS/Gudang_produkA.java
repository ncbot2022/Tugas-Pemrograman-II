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
public class Gudang_produkA extends produk {

   private final String Lokasi = "Blitar";

   @Override
    public String dataOut() {
        return getCode() + " - " + getNamaBarang() + " | Harga: " + getHarga() + " | LOKASI : " + Lokasi + " | Stok: " + getStokBarang();
    }

    @Override
    public String getLokasi() {
        return Lokasi;
    }
    
    @Override
    public void tambahProduk(long jumlah) {
        setStokBarang(getStokBarang() + jumlah); 
    }

    @Override
    public long hitungNilaiProdukPajak() {
        return getHarga() * getStokBarang(); 
    }
}
