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
public class KhachHang extends ThanhVien implements Serializable {
    private String diachi;
    private String sdt;
    
    public KhachHang(){
    }

    public KhachHang(String diachi, String sdt, int id, String vaitro, String hoten, String email, boolean dakichhoat) {
        super(id, vaitro, hoten, email, dakichhoat);
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public KhachHang(int id) {
        super(id);
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    
    
}
