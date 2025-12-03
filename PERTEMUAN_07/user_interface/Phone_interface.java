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
public interface Phone_interface {
    int MAX_VOL = 100;
    int MIN_VOL = 0;
    
    void powerON();
    void powerOFF();
    void volumeUP();
    void volumeDOWN();
    void swohroot();
    void screenshot();
}
