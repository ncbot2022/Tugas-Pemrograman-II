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
public abstract class produk {

    private String code;
    private String namaBarang;
    private long harga;
    private long stokBarang;

    public void setData(String code, String nama, long harga, long stok) {
        this.code = code;
        this.namaBarang = nama;
        this.harga = harga;
        this.stokBarang = stok;
    }

    protected void setStokBarang(long stok) {
        this.stokBarang = stok;
    }
    
    protected void setSHarga(long harga) {
        this.harga = harga;
    }

    protected void setNamabarang(String Nama) {
        this.namaBarang = Nama;
    }

    public String getCode() {
        return code;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public long getHarga() {
        return harga;
    }

    public long getStokBarang() {
        return stokBarang;
    }

    public String getLokasi() {
        return "Tidak ada";
    }

    public String dataOut() {
        return code + " - " + namaBarang + " | Harga: " + harga
                + " | Stok: " + stokBarang;
    }

    public void tambahProduk(long jumlah) {
        stokBarang += jumlah;
    }
 
    public long hitungNilaiProduk() {
        return harga * stokBarang; 
    }
    
    public abstract long hitungNilaiProdukPajak();
}
