/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_05.Keyword_This;

/**
 *
 * @author x260
 */
public class main {

    public static void main(String[] args) {
        pesawat jet = new pesawat("Sukoi", "Putih", 900);
        pesawat bomber = new pesawat("F12", "Grei", 200);

        System.out.println("=== DATA PESWAT 01 ===");
        jet.tampilkanInfo();

        System.out.println("=== DATA PESWAT 02 ===");
        bomber.tampilkanInfo();
    }
}
