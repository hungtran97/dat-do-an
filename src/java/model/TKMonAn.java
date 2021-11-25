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
public class TKMonAn extends MonAn implements Serializable{
    private float tongtien;
    
    public TKMonAn(){
        super();
    }

    public TKMonAn(float tongtien, int id, String tenmonan, NhaHang nhahang, float giaca, int soluongcothedat) {
        super(id, tenmonan, nhahang, giaca, soluongcothedat);
        this.tongtien = tongtien;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }
    
    
    
}
