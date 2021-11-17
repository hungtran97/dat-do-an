/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Hung
 */
public class HoaDon implements Serializable{
    private int id;
    private DonHang donhang;
    private Date thoigianxuat;
    private float tienthanhtoan;
    
    
    public HoaDon(){
        super();
    }

    public HoaDon(int id, DonHang donhang, Date thoigianxuat, float tienthanhtoan) {
        super();
        this.id = id;
        this.donhang = donhang;
        this.thoigianxuat = thoigianxuat;
        this.tienthanhtoan = tienthanhtoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DonHang getDonhang() {
        return donhang;
    }

    public void setDonhang(DonHang donhang) {
        this.donhang = donhang;
    }

    public Date getThoigianxuat() {
        return thoigianxuat;
    }

    public void setThoigianxuat(Date thoigianxuat) {
        this.thoigianxuat = thoigianxuat;
    }

    public float getTienthanhtoan() {
        return tienthanhtoan;
    }

    public void setTienthanhtoan(float tienthanhtoan) {
        this.tienthanhtoan = tienthanhtoan;
    }
    
    
    
}
