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
public class MonAnTrongDH implements Serializable{
    private int id;
    private MonAn monan;
    private int soluong;
    
    public MonAnTrongDH(){
        super();
    }

    public MonAnTrongDH(int id, MonAn monan, int soluong) {
        super();
        this.id = id;
        this.monan = monan;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MonAn getMonan() {
        return monan;
    }

    public void setMonan(MonAn monan) {
        this.monan = monan;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
    
    
    
}
