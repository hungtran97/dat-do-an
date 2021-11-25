/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ThanhVien implements Serializable{
    private int id;
    private String vaitro;
    private String hoten;
    private String email;
    private boolean dakichhoat;
    
    public ThanhVien(){
    }

    public ThanhVien(int id, String vaitro, String hoten, String email, boolean dakichhoat) {
        this.id = id;
        this.vaitro = vaitro;
        this.hoten = hoten;
        this.email = email;
        this.dakichhoat = dakichhoat;
    }
    
    public ThanhVien(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
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

    public boolean isDakichhoat() {
        return dakichhoat;
    }

    public void setDakichhoat(boolean dakichhoat) {
        this.dakichhoat = dakichhoat;
    }
}
