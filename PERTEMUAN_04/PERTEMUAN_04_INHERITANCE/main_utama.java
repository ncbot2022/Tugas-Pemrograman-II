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
public class main_utama {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        burung kenari = new burung();
        pocong poci = new pocong();
        zombi zumbi = new zombi();
        
        monster.name = "NIKO";
        monster.hp = 100;
        monster.attackPoint = 50;
        System.out.println( monster.name + ", " +  monster.hp + ", " + monster.attackPoint + " Gerakan : ");
        monster.attack();
        System.out.println("-------------------------------------------------");
        
        kenari.name = "Leo";
        kenari.hp = 100;
        kenari.attackPoint = 50;
        System.out.println( kenari.name + ", " +   kenari.hp + ", " + kenari.attackPoint + " Gerakan : ");
        kenari.fly();
        kenari.jump();
        kenari.walk();
        kenari.attack();
        System.out.println("-------------------------------------------------");
        
        poci.name ="Susana";
        poci.hp = 100;
        poci.attackPoint = 50;
        System.out.println( poci.name + ", " +   poci.hp + ", " + poci.attackPoint + " Gerakan : ");
        poci.jump();
        poci.attack();
        System.out.println("-------------------------------------------------");
        
        zumbi.name ="riko";
        zumbi.hp = 100;
        zumbi.attackPoint = 50;
        System.out.println( zumbi.name + ", " +   zumbi.hp + ", " + zumbi.attackPoint + " Gerakan : ");
        zumbi.walk();
        zumbi.attack();
        System.out.println("-------------------------------------------------");
    }
}
