/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Person {

    private String nama;
    private String alamat;
    private String jenkel;
    private List<String> hobi = new ArrayList<String>();

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the jenkel
     */
    public String getJenkel() {
        return jenkel;
    }

    /**
     * @param jenkel the jenkel to set
     */
    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    /**
     * @return the hobi
     */
    public List<String> getHobi() {
        return hobi;
    }

    /**
     * @param hobi the hobi to set
     */
    public void setHobi(List<String> hobi) {
        this.hobi = hobi;
    }

}
