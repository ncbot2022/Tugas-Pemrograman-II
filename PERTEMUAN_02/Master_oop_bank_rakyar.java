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
public class Master_oop_bank_rakyar {
    String nama;
    double saldo;  
    int noreqvalid;
    String passwordvalid;
    
    
    // KONSTRUKTOR AWAL
    public Master_oop_bank_rakyar(String jeneng, double saldoAwal) {
        this.nama = jeneng;
        this.saldo = saldoAwal;
    }
    
    void setorUang(double uangMasuk, int noreq_insert, String pw){
        if(noreqvalid == noreq_insert){
            if(passwordvalid.equals(pw)){
                saldo += uangMasuk;
                System.out.println("\nUang Setor    : " + uangMasuk);
            }else{
                System.out.println("Req : " +  noreqvalid + ". Password salah");
            }
        }else{
            System.out.println("Req tidak terdaftar");
        }
    }
    
    void tarikUang(double uangKeluar,  int noreq_insert, String pw){
         if(noreqvalid == noreq_insert){
            if(passwordvalid.equals(pw)){
                if (saldo >= uangKeluar) {
                    saldo -= uangKeluar;
                    System.out.println("\nUang keluar   : " + uangKeluar);
                } else {
                    System.out.println("\nSaldo tidak cukup!");
                }
             }else{
                System.out.println("Req : " +  noreqvalid + ". Password salah");
            }
        }else{
            System.out.println("Req tidak terdaftar");
        }
    }
    
    void checkSaldo( double noreq_insert, String pw){
         if(noreqvalid == noreq_insert){
            if(passwordvalid.equals(pw)){
                System.out.println("\n---------------------------");
                System.out.println("Nama          : " + nama);
                System.out.println("Saldo saat ini: Rp" + saldo);
                System.out.println("---------------------------");
            }else{
                System.out.println("Req : " +  noreqvalid + ". Password salah");
            }
        }else{
            System.out.println("Req tidak terdaftar");
        }
    }
    
    void daftarReq (int DaftarReq, String pw){
        noreqvalid = DaftarReq;
        passwordvalid = pw;
    }
}
