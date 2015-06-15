/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author user
 */
public class Pistol implements Weapon {

    private int peluru = 6;

    @Override
    public void fire() {
        if (peluru >= 1) {
            System.out.println("Dooorr!");
            --peluru;
        }else{
            System.out.println("Please reload!");
        }
    }

    @Override
    public void reload() {
        this.peluru = 6;
    }

}
