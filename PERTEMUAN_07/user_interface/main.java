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
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String aksi;

            String namaPengguna = "";
            String NomorTelphone = "";
            String Jenis_HP = "";

            phone_user Niko = new phone_user(new Phone_reamle());
            phone_user Saputra = new phone_user(new Phone_Iphone());
            phone_user Galih = new phone_user(new Phone_Samsung());
            phone_user Nur = new phone_user(new Phone_Oppo());

            phone_user aktifUser = null;

            System.out.println("======= PILIH HP ANDA =======");
            System.out.println("1. Realme C12 (Niko)");
            System.out.println("2. iPhone 15 (Saputra)");
            System.out.println("3. Samsung A17 (Galih)");
            System.out.println("4. Oppo Reno14 (Nur)\n");

            System.out.print(" Masukan pilihan Hp Anda : ");
            String pilih = input.nextLine();

            switch (pilih) {
                case "1":
                    aktifUser = Niko;
                    namaPengguna = "M.Niko Nur Cahyono";
                    NomorTelphone = "08582174881";
                    Jenis_HP = "Realme C12";
                    break;
                case "2":
                    aktifUser = Saputra;
                    namaPengguna = "Saputra jokowinarto";
                    NomorTelphone = "085886547454";
                    Jenis_HP = "iPhone 15";
                    break;
                case "3":
                    aktifUser = Galih;
                    namaPengguna = "Galih bimasya";
                    NomorTelphone = "0858824352113";
                    Jenis_HP = "Samsung A17";
                    break;
                case "4":
                    aktifUser = Nur;
                    namaPengguna = "Nurlinga jaya";
                    NomorTelphone = "085123468356892";
                    Jenis_HP = "Samsung A17";
                    break;
                default:
                    System.out.println("!! Pilihan tidak tersedia");
                    System.exit(0);
            }
            boolean procces = true;
            while (procces) {
                System.out.println("\n============PENGGUNA =============");
                System.out.println("1. Pemilik  :" + namaPengguna);
                System.out.println("2. Nomor Hp :" + NomorTelphone);
                System.out.println("3. Merek Hp :" + Jenis_HP);

                System.out.println("\n======= APLIKASI INTERFACE =======");
                System.out.println("1. Menyalakan HP");
                System.out.println("2. Mematikan HP");
                System.out.println("3. Tambah Volume");
                System.out.println("4. Kurangi Volume");
                System.out.println("5. Screenshot    ");
                System.out.println("6. Show 0 Root \n");

                System.out.print(" Masukan Pilihan Anda : ");
                aksi = input.nextLine();

                switch (aksi) {
                    case "1":
                        aktifUser.pw_onPhone();
                        break;
                    case "2":
                        aktifUser.pw_offPhone();
                        System.out.println("\n");
                        procces = false;

                        break;
                    case "3":
                        aktifUser.makePhoneLouder();
                        break;
                    case "4":
                        aktifUser.makePhonesilent();
                        break;
                    case "5":
                        aktifUser.SS();
                        break;
                    case "6":
                        aktifUser.showRoot();
                        break;
                    default:
                        System.out.println("!! Interface Tidak Tersedia");

                        break;
                }
            }
        }
    }
}
