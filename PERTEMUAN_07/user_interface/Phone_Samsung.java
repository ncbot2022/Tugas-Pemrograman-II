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
public class Phone_Samsung implements Phone_interface {

    private int vol = 50;
    private boolean statusHPSamsung = false;

    public Phone_Samsung() {
        this.vol = 50;
    }

    @Override
    public void powerON() {
        statusHPSamsung = true;
        System.out.println(">> Handphone Berhasil Menyala.....");
        System.out.println(">> Selamat menikmasti fitur canggih Samsung camera HIGH .....");
        System.out.println(">> Versi Android 100.12");
    }

    @Override
    public void powerOFF() {
        statusHPSamsung = false;
        System.out.println("!! Handphone Berhasil dimatikan.....");
    }

    @Override
    public void volumeUP() {
        if (!statusHPSamsung) {
            System.out.println("!! Hidupkan HP terlebih dahulu !!");
            return;
        }

        if (vol == MAX_VOL) {
            System.out.println("!! Volume FULL (" + vol + "%)");
            return;
        }

        vol += 10;
        System.out.println(">> Volume Sekarang : " + vol + "%");

    }

    @Override
    public void volumeDOWN() {
        if (!statusHPSamsung) {
            System.out.println("!! Nyalakan Dulu Phone Anda....!!! ");
        } else {
            vol = (vol == MIN_VOL) ? MIN_VOL : vol - 10;

            System.out.println(vol == MIN_VOL
                    ? "!! Volume Silent\n>> Volume : " + vol + "%"
                    : ">> Volume Sekarang : " + vol + "%");
        }

    }

    @Override
    public void swohroot() {
        System.out.println("=== ROOT ANDROID Samsung ===");
        System.out.println("1. /system");
        System.out.println("2. /data");
        System.out.println("3. /storage");
        System.out.println("4. /sdcard");
        System.out.println("5. /vendor");
        System.out.println("6. /mnt");
        System.out.println("7. /proc");
        System.out.println("8. /dev");
        System.out.println("9. /boot");
    }

    @Override
    public void screenshot() {
        System.out.println("Samsung Menamkap layar");
    }

}
