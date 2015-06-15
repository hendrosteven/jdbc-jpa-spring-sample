/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import obj.Bazoka;
import obj.Pistol;
import obj.Senapan;
import obj.Weapon;
import user.Soldier;

/**
 *
 * @author user
 */
public class TesterApp {
    public static void main(String[] args){
        Weapon pistol = new Pistol();
        Weapon senapan = new Senapan ();
        Weapon bazoka = new Bazoka();
        Soldier rambo = new Soldier(pistol);
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.firing();
        rambo.reloading();
        rambo.firing();
    }
}
