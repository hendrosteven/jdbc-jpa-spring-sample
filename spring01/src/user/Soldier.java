/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import obj.Senjata;

/**
 *
 * @author user
 */
public class Soldier {
    private Senjata wp;
    
    public Soldier(Senjata wp){
        this.wp = wp;
    }
    
    public void firing(){
        this.wp.fire();
    }
    
    public void reloading(){
        this.wp.reload();
    }
}
