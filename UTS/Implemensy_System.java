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

public class Implemensy_System implements Interface_System {

    private setter_getter_key akun;
    private ArrayList<produk> gudangA = new ArrayList<>();
    private ArrayList<produk> gudangB = new ArrayList<>();
    private String name;
    private String password;

    @Override
    public String CheckLogin(String user, String PW) {
        akun = new setter_getter_key();
        akun.Set_username("niko");
        akun.Set_password("2025");

        name = akun.Get_username();
        password = akun.Get_password();

        if (password.equals(PW)) {
            return "Login Berhasil";
        } else {
            return "Login Gagal";
        }
    }

    @Override
    public void tambah_gudang_A(String kode, String nama, long harga, long stok) {
        produk p = new Gudang_produkA();
        p.setData(kode, nama, harga, stok);
        gudangA.add(p);

        System.out.println("Produk ditambahkan ke Gudang A:");
        System.out.println(p.dataOut());
    }

    @Override
    public void tambah_gudang_B(String kode, String nama, long harga, long stok) {
        produk p = new Gudang_produkB();
        p.setData(kode, nama, harga, stok);
        gudangB.add(p);

        System.out.println("Produk ditambahkan ke Gudang B:");
        System.out.println(p.dataOut());
    }

    @Override
    public ArrayList<produk> getListGudangA() {
        return gudangA;
    }

    @Override
    public ArrayList<produk> getListGudangB() {
        return gudangB;
    }

    @Override
    public int kurangiStokGudangA(String kodeAtauNama, long jumlah) {
        for (produk p : gudangA) {
            if (p.getCode().equalsIgnoreCase(kodeAtauNama) || p.getNamaBarang().equalsIgnoreCase(kodeAtauNama)) {
                if (p.getStokBarang() >= jumlah) {
                    p.setStokBarang(p.getStokBarang() - jumlah);
                    return 1;
                } else {
                    System.out.println("Stok tidak cukup!");
                    return 2;
                }
            }
        }
        System.out.println("Barang tidak ditemukan di Gudang A!");
        return 3;
    }

    @Override
    public int kurangiStokGudangB(String kodeAtauNama, long jumlah) {
        for (produk p : gudangB) {
            if (p.getCode().equalsIgnoreCase(kodeAtauNama) || p.getNamaBarang().equalsIgnoreCase(kodeAtauNama)) {
                if (p.getStokBarang() >= jumlah) {
                    p.setStokBarang(p.getStokBarang() - jumlah);
                    return 1;
                } else {
                    System.out.println("Stok tidak cukup!");
                    return 2;
                }
            }
        }
        System.out.println("Barang tidak ditemukan di Gudang B!");
        return 3;
    }

    public int tambahStokGudangA(String kodeAtauNama, long jumlah) {
        for (produk p : getListGudangA()) {
            if (p.getCode().equalsIgnoreCase(kodeAtauNama)
                    || p.getNamaBarang().equalsIgnoreCase(kodeAtauNama)) {

                p.tambahProduk(jumlah);
                System.out.println("Berhasil");
                return 1;
            } else {
                System.out.println("Produk Tidak Tersedua");
                return 2;
            }
        }
        System.out.println("Produk Berhasil Di tambahan");
        return 3;
    }

    @Override
    public int editProdukGudangA(String kode, String namaBaru, Long hargaBaru, Long tambahStok) {
        for (produk p : getListGudangA()) {
            if (p.getCode().equalsIgnoreCase(kode)) {
                if (namaBaru != null && !namaBaru.trim().isEmpty()) {
                    p.setNamabarang(namaBaru);
                    System.out.println("Nama B Diganti");
                }
                if (hargaBaru != null && hargaBaru > 0) {
                    p.setSHarga(hargaBaru);
                    System.out.println("Harga B Diganti");
                }
                if (tambahStok != null && tambahStok > 0) {
                    p.tambahProduk(tambahStok);
                    System.out.println("Stok ditambah");
                }
                return 1; // BERHASIL
            }
        }
        return 3; // KODE TIDAK DITEMUKAN
    }

    @Override
    public int editProdukGudangB(String kode, String namaBaru, Long hargaBaru, Long tambahStok) {
        for (produk p : getListGudangB()) {
            if (p.getCode().equalsIgnoreCase(kode)) {
                if (namaBaru != null && !namaBaru.trim().isEmpty()) {
                    p.setNamabarang(namaBaru);
                    System.out.println("Nama B Diganti");
                }
                if (hargaBaru != null && hargaBaru > 0) {
                    p.setSHarga(hargaBaru);
                    System.out.println("Harga B Diganti");
                }
                if (tambahStok != null && tambahStok > 0) {
                    p.tambahProduk(tambahStok);
                    System.out.println("Stok ditambah");
                }
                return 1; // BERHASIL
            }
        }
        return 3; // KODE TIDAK DITEMUKAN
    }

    @Override
    public long hitungTotalNilaiPajak(ArrayList<produk> list) {
        long total = 0;
        for (produk p : list) {
            total += p.hitungNilaiProdukPajak(); // POLIMORFISME
        }
        return total;
    }
    
    @Override
    public long hitungTotalNilai(ArrayList<produk> list) {
        long total = 0;
        for (produk p : list) {
            total += p.hitungNilaiProduk(); // POLIMORFISME
        }
        return total;
    }

    @Override
    public long hitungTotalStok(ArrayList<produk> list) {
        long total = 0;
        for (produk p : list) {
            total += p.getStokBarang();
        }
        return total;
    }
}
