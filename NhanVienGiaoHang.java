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
public class NhanVienGiaoHang extends ThanhVien  implements Serializable{
    
    private String sdt;

    
    public NhanVienGiaoHang(){
        super();
    }

    public NhanVienGiaoHang(String sdt, int id, String hoten, String email, String vaitro, boolean dakichhoat) {
        super(id, hoten, email, vaitro, dakichhoat);
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}
