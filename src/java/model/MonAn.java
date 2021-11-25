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
public class MonAn implements Serializable{
    private int id;
    private String tenmonan;
    private NhaHang nhahang;
    private float giaca;
    private int soluongcothedat;
    
    public MonAn(){
        super();
    }

    public MonAn(int id, String tenmonan, NhaHang nhahang, float giaca, int soluongcothedat) {
        super();
        this.id = id;
        this.tenmonan = tenmonan;
        this.nhahang = nhahang;
        this.giaca = giaca;
        this.soluongcothedat = soluongcothedat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public NhaHang getNhahang() {
        return nhahang;
    }

    public void setNhahang(NhaHang nhahang) {
        this.nhahang = nhahang;
    }

    public float getGiaca() {
        return giaca;
    }

    public void setGiaca(float giaca) {
        this.giaca = giaca;
    }

    public int getSoluongcothedat() {
        return soluongcothedat;
    }

    public void setSoluongcothedat(int soluongcothedat) {
        this.soluongcothedat = soluongcothedat;
    }
    
    
    
    
}
