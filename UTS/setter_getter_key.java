/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3;

/**
 *
 * @author x260
 */
public class setter_getter_key {
    private String userName;
    private String password;
    
    public void Set_username (String username){
        this.userName = username;
    }
    public void Set_password (String password){
        this.password= password;
    }
    public String Get_username(){
        return this.userName;
    }
    public String Get_password(){
        return this.password;
    }
}
