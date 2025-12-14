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
import java.util.ArrayList;

public interface Interface_System {

    String CheckLogin(String user, String PW);

    void tambah_gudang_A(String kode, String nama, long harga, long stok);

    void tambah_gudang_B(String kode, String nama, long harga, long stok);

    public int kurangiStokGudangA(String kodeAtauNama, long jumlah);

    public int kurangiStokGudangB(String kodeAtauNama, long jumlah);

    public int editProdukGudangA(String kode, String namaBaru, Long hargaBaru, Long tambahStok);

    public int editProdukGudangB(String kode, String namaBaru, Long hargaBaru, Long tambahStok);

    long hitungTotalNilaiPajak(ArrayList<produk> list);
    
    long hitungTotalNilai(ArrayList<produk> list);
              
    long hitungTotalStok(ArrayList<produk> list);

    ArrayList<produk> getListGudangA();

    ArrayList<produk> getListGudangB();

}
