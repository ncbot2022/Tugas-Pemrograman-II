/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_03;

/**
 *
 * @author x260
 */
public class mahasiswa {
   String nim;
   String nama;
   double ipk = 0;
   String status;
   
   double uang_saya = 0;
   
   // KONTRUKTOR
   public mahasiswa(String nim, String nama, double ipk){
       this.nim= nim;
       this.nama = nama;
       this.ipk = ipk;
   }
   
   
   // MEMBUAT PROSEDUR
   void tampil_mahasiswa(){
       System.out.println("NIM  : " + nim);
       System.out.println("NAMA : " + nama);
       System.out.println("IPK  :" + ipk);    
   }
   
   // MEMBUAT FUNGSI
   String predikat(){
       if(ipk > 4.0){
           status = "cumload";
       }else if(ipk > 3.5){
           status = "biasa";
       }else if(ipk > 3.0){
           status = "buruk";
       }else if(ipk > 2.5){
            status = "mengulang";
       }else{
           status = "IPK tidak valid";
       }
       return status;
    } 
   
   // PROSEDURE YANG ADA PARAMETERYA
   void nilai_sanggah(double ipk_tambahan){
       ipk = ipk+ipk_tambahan;
   }
   
    // FUNGSI YANG ADA PARAMETERYA
   double kip(int no_req){
       if(no_req == 123){
            if(ipk > 3.6){
                uang_saya = 4000000;
            }
       }
       return uang_saya;
   }
   
   
}
