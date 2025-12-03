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
public class phone_user {

    private Phone_interface phone;
    
    public phone_user(Phone_interface phone) {
        this.phone = phone;
    }

    void pw_onPhone() {  
        this.phone.powerON();
    }

    void pw_offPhone() {
        this.phone.powerOFF();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUP();
    }
    
    void makePhonesilent(){
        this.phone.volumeDOWN();
    }
    void showRoot(){
         this.phone.swohroot();
    }
    
    void SS(){
        this.phone.screenshot();
    }
    
}
