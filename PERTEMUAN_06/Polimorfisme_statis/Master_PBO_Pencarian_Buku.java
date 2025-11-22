/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_06.Polimorfisme_statis;

/**
 *
 * @author x260
 */
public class Master_PBO_Pencarian_Buku {

    private String judulBuku;

    void search(String judul) {
        System.out.println("Mencari buku dengan judul: " + judul);
        switch (judul) {
            case "Sikancil":
                judulBuku = "Sikancil";
                break;
            case "Malinkundang":
                judulBuku = "Malinkundang";
                break;
            case "Lutung Kasarung":
                judulBuku = "Lutung Kasarung";
                break;
            case "Timun Mas":
                judulBuku = "Timun Mas";
                break;
            case "Bawang Merah Bawang Putih":
                judulBuku = "Bawang Merah Bawang Putih";
                break;
            default:
                judulBuku = null;
                System.out.println(">> Buku tidak ditemukan dalam database.");
                break;
        }
        if (judulBuku != null) {
            System.out.println(">> Buku ditemukan: " + judulBuku);
        }
    }

    void search(int kodeBuku) {
        System.out.println("Mencari buku dengan KODE: " + kodeBuku);
        switch (kodeBuku) {
            case 101:
                judulBuku = "Sikancil";
                break;
            case 102:
                judulBuku = "Malinkundang";
                break;
            case 103:
                judulBuku = "Lutung Kasarung";
                break;
            case 104:
                judulBuku = "Timun Mas";
                break;
            case 105:
                judulBuku = "Bawang Merah Bawang Putih";
                break;
            default:
                judulBuku = null;
                System.out.println(">> Kode buku tidak ditemukan.");
        }

        if (judulBuku != null) {
            System.out.println(">> Buku ditemukan: " + judulBuku);
        }
    }

    void search(String judul, int tahun) {
        System.out.println("Mencari buku: " + judul + " (Tahun: " + tahun + ")");
        judulBuku = judul; 
        System.out.println(">> Buku ditemukan: " + judulBuku + " (" + tahun + ")");      
    }
}
