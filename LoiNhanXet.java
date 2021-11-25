/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author duong
 */
public class LoiNhanXet {
    private KhachHang khachHang;
    private String chitietloinhanxet;
    private Date ngaydang;

    public LoiNhanXet(KhachHang khachHang, String chitietloinhanxet, Date ngaydang) {
        this.khachHang = khachHang;
        this.chitietloinhanxet = chitietloinhanxet;
        this.ngaydang = ngaydang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public String getChitietloinhanxet() {
        return chitietloinhanxet;
    }

    public void setChitietloinhanxet(String chitietloinhanxet) {
        this.chitietloinhanxet = chitietloinhanxet;
    }

    public Date getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(Date ngaydang) {
        this.ngaydang = ngaydang;
    }
    
}
