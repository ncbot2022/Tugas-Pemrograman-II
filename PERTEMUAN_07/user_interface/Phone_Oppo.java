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
public class Phone_Oppo implements Phone_interface {

    private int vol = 50;
    private boolean statusHPOppo = false;

    public Phone_Oppo() {
        this.vol = 50;
    }

    private void tambahVolume() {
        if (vol < MAX_VOL) {
            vol += 10;
        }
        System.out.println(">> Volume Sekarang : " + vol + "%");
    }

    @Override
    public void powerON() {
        statusHPOppo = true;
        System.out.println(">> Handphone Berhasil Menyala.....");
        System.out.println(">> Selamat menikmasti fitur canggih OPPO .....");
        System.out.println(">> Versi Android 100.12");
    }

    @Override
    public void powerOFF() {
        statusHPOppo = false;
        System.out.println("!! Handphone Berhasil dimatikan.....");
    }

    @Override
    public void volumeUP() {
        if (statusHPOppo) {
            tambahVolume();
        } else {
            System.out.println("!! HP Belum Menyala !!");
        }
    }

    @Override
    public void volumeDOWN() {
        if (!statusHPOppo) {
            System.out.println("!! Nyalakan Dulu Phone Anda....!!! ");
        } else {
            int before = vol;
            vol = Math.max(MIN_VOL, vol - 10);

            if (before == MIN_VOL) {
                System.out.println("!! Volume Silent");
                System.out.println(">> Volume : " + vol + "%");
            } else {
                System.out.println(">> Volume Sekarang : " + vol + "%");
            }
        }

    }

    @Override
    public void swohroot() {
        System.out.println("=== ROOT ANDROID OPPO ===");
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
        System.out.println("OPPO Menamkap layar");
    }
}
