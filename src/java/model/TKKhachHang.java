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
public class TKKhachHang extends KhachHang implements Serializable{
    private float doanhthutheongay;
    
    public TKKhachHang(){
        super();
    }   

    public float getDoanhthu() {
        return doanhthutheongay;
    }

    public void setDoanhthu(float doanhthutheongay) {
        this.doanhthutheongay = doanhthutheongay;
    }
}
