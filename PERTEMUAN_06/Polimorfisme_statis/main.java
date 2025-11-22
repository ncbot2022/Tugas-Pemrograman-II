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
public class main {
    public static void main(String[] args) {
        Master_PBO_Pencarian_Buku buku = new Master_PBO_Pencarian_Buku();
        
        buku.search("Sikancil");
        buku.search(101);
        buku.search("Sikancil", 2025);
    }
}
