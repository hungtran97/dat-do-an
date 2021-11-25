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
public class TKKhachHang extends KhachHang implements Serializable{
    private float doanhthutheongay;
    
    public TKKhachHang(){
        super();
    }

    public TKKhachHang(float tongtien, String diachi, String sdt, int id, String hoten, String email, String vaitro, boolean dakichhoat) {
        super(diachi, sdt, id, hoten, email, vaitro, dakichhoat);
        this.doanhthutheongay = tongtien;
    }

    

    public float getDoanhthutheongay() {
        return doanhthutheongay;
    }

    public void setDoanhthutheongay(float doanhthutheongay) {
        this.doanhthutheongay = doanhthutheongay;
    }
    
    
    
}
