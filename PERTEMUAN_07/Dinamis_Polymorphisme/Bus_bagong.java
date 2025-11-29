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
public class Bus_bagong extends Transportasi {

    public Bus_bagong(String tujuan) {
        super(tujuan);
    }
    
    @Override
    double harga_tiket() {
        switch (tujuan.toLowerCase()) {
            case "jakarta":
                return 75000;
            case "bandung":
                return 55000;
            case "surabaya":
                return 90000;
            default:
                return 60000;
        }
    }

}
