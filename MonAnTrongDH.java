/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author duong
 */
public class MonAnTrongDH {
    private MonAn monan;
    private int soluongdat;

    public MonAnTrongDH(MonAn monan, int soluongdat) {
        this.monan = monan;
        this.soluongdat = soluongdat;
    }

    public MonAn getMonan() {
        return monan;
    }

    public void setMonan(MonAn monan) {
        this.monan = monan;
    }

    public int getSoluongdat() {
        return soluongdat;
    }

    public void setSoluongdat(int soluongdat) {
        this.soluongdat = soluongdat;
    }
    
}
