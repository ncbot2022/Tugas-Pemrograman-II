/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_07.user_interface;

/**
 *
 * @author x260
 */
public class Phone_Iphone implements Phone_interface {

    private boolean statusApssIphone = false;
    private int volume;

    public Phone_Iphone() {
        this.volume = 50;
    }

    @Override
    public void powerON() {
        statusApssIphone = true;
        System.out.println(">> Handphone Berhasil Menyala.....");
        System.out.println(">> Selamat menikmasti fitur canggih super Iphone.....");
        System.out.println(">> Versi Android 100.12");
    }

    @Override
    public void powerOFF() {
        statusApssIphone = false;
        System.out.println("!! Handphone Berhasil dimatikan.....");
    }

    @Override
    public void volumeUP() {
        if (!statusApssIphone) {
            System.out.println("!! Hidupkan dulu HP Anda !!");
            return;
        }
        volume = (volume + 10 > MAX_VOL) ? MAX_VOL : volume + 10;
        System.out.println(">> Volume Sekarang : " + volume + "%");
    }

    @Override
    public void volumeDOWN() {
        if (!statusApssIphone) {
            System.out.println("!! Nyalakan Dulu Phone Anda....!!! ");
            return;
        }

        if (volume <= MIN_VOL) {
            System.out.println("!! Volume Silent");
            System.out.println(">> Volume : " + volume + "%");
            return;
        }

        volume -= 10;
        System.out.println(">> Volume Sekarang : " + volume + "%");

    }

    @Override
    public void swohroot() {
        System.out.println("=== ROOT ANDROID Iphone ===");
        System.out.println("AKSES DITOLAK SISTEM");
    }

    @Override
    public void screenshot() {
        System.out.println("Iphone Menamkap layar");
    }

}
