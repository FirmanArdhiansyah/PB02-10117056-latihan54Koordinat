/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {
   public static void main(String[] args) {
        Warnakoordinat Warnakoordinat = new Warnakoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+Warnakoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+Warnakoordinat.getX()+", y : "+Warnakoordinat.getY());
    }
}
