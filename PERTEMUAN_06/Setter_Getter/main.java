/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_06.Setter_Getter;

/**
 *
 * @author x260
 */
public class main {
    public static void main(String[] args) {
        IG_Login IG = new IG_Login();
        Master_PBO_user user = new Master_PBO_user();
        
        IG.login("Niko", "12343", user);
        
        user.Set_username("NikoNur");
        user.Set_password("12@322");
        
        IG.login("Niko", "12343", user);
        
        IG.login("NikoNur", "12@322", user);
      
      
    }    
}
