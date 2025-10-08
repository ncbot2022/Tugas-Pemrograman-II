/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_02;

/**
 *
 * @author x260
 */
public class Sistem_bank_rakyat {
    public static void main(String[] args) {
        Master_oop_bank_rakyar BRI = new Master_oop_bank_rakyar("Niko", 1000);
        Master_oop_bank_rakyar JAGO = new Master_oop_bank_rakyar("DWI", 100000);
   
        BRI.daftarReq(124,"ABC");
        JAGO.daftarReq(125,"ABD");
        
        BRI.setorUang(500, 124, "AB");
        BRI.checkSaldo(124, "ABC");
        
        BRI.setorUang(500, 124, "ABC");
        BRI.checkSaldo(124, "ABC");
        
        BRI.tarikUang(500, 124, "ABC");
        BRI.checkSaldo(124, "ABC");
        
        
        JAGO.setorUang(500, 124, "AB");
        JAGO.checkSaldo(124, "ABC");
        
        JAGO.setorUang(500, 124, "ABC");
        JAGO.checkSaldo(124, "ABC");
        
        JAGO.tarikUang(500, 124, "ABC");
        JAGO.checkSaldo(124, "ABC");
        
        
        JAGO.setorUang(500, 125, "ABD");
        JAGO.checkSaldo(125, "ABD");
        
        JAGO.setorUang(500, 125, "ABD");
        JAGO.checkSaldo(125, "ABD");
        
        JAGO.tarikUang(500, 125, "ABD");
        JAGO.checkSaldo(125, "ABD");
        
        
        
    }
}
