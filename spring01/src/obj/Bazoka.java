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
public class Bazoka implements Senjata {

    private int peluru = 1;

    @Override
    public void fire() {
        if (peluru >= 1) {
            System.out.println("BOOOMMM!!");
            --peluru;
        } else {
            System.out.println("Please reload!");
        }
    }

    @Override
    public void reload() {
        this.peluru = 1;
    }

}
