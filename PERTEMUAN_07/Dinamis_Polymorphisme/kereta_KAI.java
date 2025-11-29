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
public class kereta_KAI extends Transportasi {

    public kereta_KAI(String tujuan) {
        super(tujuan);
    }
    
    @Override
    double harga_tiket() {
        switch (tujuan.toLowerCase()) {
            case "jakarta":
                return 120000;
            case "bandung":
                return 100000;
            case "surabaya":
                return 150000;
            default:
                return 110000;
        }
    }
}
