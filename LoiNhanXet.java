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
public class LoiNhanXet implements Serializable{
    private int id;
    private KhachHang khachhang;
    private Date ngaydang;
    private String chitietloinhanxet;
    
    public LoiNhanXet(){
        super();
    }

    public LoiNhanXet(int id, KhachHang khachhang, Date ngaydang, String chitietloinhanxet) {
        super();
        this.id = id;
        this.khachhang = khachhang;
        this.ngaydang = ngaydang;
        this.chitietloinhanxet = chitietloinhanxet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public Date getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(Date ngaydang) {
        this.ngaydang = ngaydang;
    }

    public String getChitietloinhanxet() {
        return chitietloinhanxet;
    }

    public void setChitietloinhanxet(String chitietloinhanxet) {
        this.chitietloinhanxet = chitietloinhanxet;
    }
    
    
    
}
