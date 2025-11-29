/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_07.Dinamis_Polymorphisme;

/**
 *
 * @author x260
 */
public class Pesawat_terbang extends Transportasi {

    public Pesawat_terbang(String tujuan) {
        super(tujuan);
    }

    @Override
    double harga_tiket() {
        switch (tujuan.toLowerCase()) {
            case "jakarta":
                return 650000;
            case "bandung":
                return 550000;
            case "surabaya":
                return 850000;
            default:
                return 700000;
        }
    }
}
