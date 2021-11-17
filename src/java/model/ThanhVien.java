/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Hung
 */
public class ThanhVien implements Serializable{
    private int id;
    private String hoten;
    private String email;
    private String vaitro;
    private boolean dakichhoat;
    
    public ThanhVien(){
        super();
    }

    public ThanhVien(int id, String hoten, String email, String vaitro, boolean dakichhoat) {
        super();
        this.id = id;
        this.hoten = hoten;
        this.email = email;
        this.vaitro = vaitro;
        this.dakichhoat = dakichhoat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public boolean isDakichhoat() {
        return dakichhoat;
    }

    public void setDakichhoat(boolean dakichhoat) {
        this.dakichhoat = dakichhoat;
    }
    
    
    
}
