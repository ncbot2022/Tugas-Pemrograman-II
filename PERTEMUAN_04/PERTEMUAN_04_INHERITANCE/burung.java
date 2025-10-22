/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_04_INHERITANCE;

/**
 *
 * @author x260
 */
public class burung extends Enemy{
    public void walk(){
        System.out.println("jalan - Jalan");
    }
    public void jump(){
        System.out.println("Burung loncat - loncat");
    }
    
    public void fly(){
        System.out.println("Burung terbang");
    }
}
