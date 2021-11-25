/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HoaDon implements Serializable{
    private int id;
    private float tienthanhtoan;
    private Date thoigianxuat;

    public HoaDon() {
    }

    public HoaDon(int id, float tienthanhtoan, Date thoigianxuat) {
        this.id = id;
        this.tienthanhtoan = tienthanhtoan;
        this.thoigianxuat = thoigianxuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTienthanhtoan() {
        return tienthanhtoan;
    }

    public void setTienthanhtoan(float tienthanhtoan) {
        this.tienthanhtoan = tienthanhtoan;
    }

    public Date getThoigianxuat() {
        return thoigianxuat;
    }

    public void setThoigianxuat(Date thoigianxuat) {
        this.thoigianxuat = thoigianxuat;
    }
    
    
}
