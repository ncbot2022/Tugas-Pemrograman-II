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
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Phone_reamle implements Phone_interface {

    private int volume = 0;
    private boolean statusPowerOn;

    public Phone_reamle() {
        this.volume = 50;
    }

    public static void tekanPrintScreen() {
        try {
            Robot robot = new Robot();

            // Delay opsional (misal untuk memberi waktu user)
            robot.delay(500);

            // Tekan tombol Print Screen
            robot.keyPress(KeyEvent.VK_PRINTSCREEN);
            robot.keyRelease(KeyEvent.VK_PRINTSCREEN);

            System.out.println("PrintScreen ditekan secara virtual!");

        } catch (Exception e) {
            System.out.println("Gagal menekan PrintScreen: " + e.getMessage());
        }
    }

    @Override
    public void powerON() {
        statusPowerOn = true;
        System.out.println(">> Handphone Berhasil Menyala.....");
        System.out.println(">> Selamat menikmasti fitur canggih super REALME.....");
        System.out.println(">> Versi Android 100.10");
    }

    @Override
    public void powerOFF() {
        statusPowerOn = false;
        System.out.println("!! Handphone Berhasil dimatikan.....");
    }

    @Override
    public void volumeUP() {
        if (statusPowerOn) {
            if (volume == MAX_VOL) {
                System.out.println("!! Voulem FULL");
                System.out.println(">> Volume : " + volume + "%");
            } else {
                volume += 10;
                System.out.println(">> Volume Sekarang : " + volume + "%");
            }
        } else {
            System.out.println("!! Nyalakan Dulu Phone Anda....!!! ");
        }
    }

    @Override
    public void volumeDOWN() {
        if (statusPowerOn) {
            if (volume == MIN_VOL) {
                System.out.println("!! Voulem Silent");
                System.out.println(">> Volume : " + volume + "%");
            } else {
                volume -= 10;
                System.out.println(">> Volume Sekarang : " + volume + "%");
            }
        } else {
            System.out.println("!! Nyalakan Dulu Phone Anda....!!! ");
        }
    }

    @Override
    public void swohroot() {
        System.out.println("=== ROOT ANDROID REALME ===");
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
        System.out.println("REALME Menamkap layar");
        tekanPrintScreen();
    }
}
