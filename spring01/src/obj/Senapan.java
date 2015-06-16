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
public class Senapan implements Senjata{

     private int peluru = 12;
    
    @Override
    public void fire() {
        if (peluru >= 1) {
            System.out.println("Duuuaaarrr!");
            --peluru;
        }else{
            System.out.println("Please reload!");
        }
    }

    @Override
    public void reload() {
        this.peluru = 12;
    }
    
}
